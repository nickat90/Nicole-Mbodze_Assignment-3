nodes = {
    "EdgeA": {"cpu": 40, "memory": 4},
    "CoreX": {"cpu": 65, "memory": 8},
    "CloudZ": {"cpu": 72, "memory": 16}
}

def balance_load(nodes):
    for node in nodes:
        if nodes[node]["cpu"] > 70:
            print(f"Redistributing load from {node}")

balance_load(nodes)
