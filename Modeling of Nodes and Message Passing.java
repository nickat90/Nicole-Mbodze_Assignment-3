class Node {
    String nodeName;
    double latency;
    double throughput;
    double packetLoss;

    Node(String name, double latency, double throughput, double packetLoss) {
        this.nodeName = name;
        this.latency = latency;
        this.throughput = throughput;
        this.packetLoss = packetLoss;
    }

    void sendMessage(Node receiver, String message) {
        System.out.println(nodeName + " sends message to " + receiver.nodeName);
    }

    void handleEvent(String event) {
        System.out.println(nodeName + " handling event: " + event);
    }
}
