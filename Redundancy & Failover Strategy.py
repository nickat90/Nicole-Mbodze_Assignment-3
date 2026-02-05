nodes = {
    "Core1": "UP",
    "Core2": "UP"
}

primary = "Core1"
backup = "Core2"

def get_active_node():
    if nodes[primary] == "UP":
        return primary
    else:
        return backup

nodes["Core1"] = "DOWN"

print("Active node:", get_active_node())
