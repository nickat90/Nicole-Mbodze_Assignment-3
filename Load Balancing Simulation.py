nodes = {
    "EdgeA": {"cpu": 40, "memory": 4},
    "EdgeB": {"cpu": 48, "memory": 5},
    "CoreX": {"cpu": 65, "memory": 8},
    "CloudZ": {"cpu": 72, "memory": 16}
}

def balance_load(nodes):
    overloaded = [n for n in nodes if nodes[n]["cpu"] > 70]
    underloaded = [n for n in nodes if nodes[n]["cpu"] < 50]

    for o in overloaded:
        for u in underloaded:
            transfer = 5
            nodes[o]["cpu"] -= transfer
            nodes[u]["cpu"] += transfer
            print(f"Transferred {transfer}% CPU from {o} to {u}")
            return

balance_load(nodes)
print(nodes)

