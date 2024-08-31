import json
import sys
import os


if __name__=="__main__":
    final_graph_path = sys.argv[1]
    output_path = sys.argv[2]
    with open(final_graph_path, 'r') as f:
        final_graph = json.load(f)
    partitions = dict()
    node_names = list()
    node_partitions = list()
    for node in final_graph['micro_detail_partition_by_business_logic']["nodes"]:
        partition_name = node["category"]
        if not partition_name in partitions:
            partition = dict(name=partition_name, classes=[], group=node["group"])
            partitions[partition_name] = partition
        else:
            partition = partitions[partition_name]
            assert partition["group"]==node["group"]
        partition["classes"].append(node["FQCN"])
        if not partition_name in ["src_dest_undefined_use_case", "Unobserved"]:
            node_names.append(node["FQCN"])
            node_partitions.append(partition_name)
    partition_names = [partition for partition in partitions if not partition in ["src_dest_undefined_use_case", "Unobserved"]]
    partitions_encoding = [{"name":partition["name"], "classes":partition["classes"]} for partition in partitions.values() if partition["name"]!="Unobserved"]
    if not os.path.exists(output_path):
        os.mkdir(output_path)
    with open(os.path.join(output_path, "{}.json".format("mono2micro_decomposition")), "w") as f:
        json.dump(partitions_encoding, f)