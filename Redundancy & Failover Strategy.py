primary = "Core1"
backup = "Core2"

def failover(status):
    if status == "fail":
        return backup
    return primary
