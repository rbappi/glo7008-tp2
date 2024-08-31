import json
import os
import argparse

import numpy as np
import pandas as pd


if __name__=="__main__":
    # Parsing input
    parser = argparse.ArgumentParser(
        prog='to_msextractor',
        description='prepare parsing data for MSExtractor')
    parser.add_argument('APP', type=str, help='application to decompose')
    parser.add_argument("-d", "--data", help='path for the data',
                              type=str, default="/data")
    parser.add_argument("-o", "--output", help='path for the output', type=str, default="/output")
    args = parser.parse_args()
    app_name = args.APP
    data_path = args.data
    output_path = args.output
    calls = pd.read_csv(os.path.join(data_path, "calls.csv"), index_col=0)
    class_names = list(calls.columns)
    os.makedirs(os.path.join(output_path, app_name, "structural_data"), exist_ok=True)
    np.save(os.path.join(output_path, app_name, "structural_data", "class_calls.npy"), calls.values)
    with open(os.path.join(output_path, app_name, "structural_data", "class_names.json"), "w") as f:
        json.dump(class_names, f)
    tfidf = pd.read_csv(os.path.join(data_path, "tfidf.csv"), index_col=0)
    class_names = list(calls.index.values)
    os.makedirs(os.path.join(output_path, app_name, "semantic_data"), exist_ok=True)
    np.save(os.path.join(output_path, app_name, "semantic_data", "class_tfidf.npy"), tfidf.values)
    with open(os.path.join(output_path, app_name, "semantic_data", "class_names.json"), "w") as f:
        json.dump(class_names, f)
