import java.util.Random;

class Node {
    String name;
    double latency;
    double throughput;
    double packetLoss;

    Node(String name, double latency, double throughput, double packetLoss) {
        this.name = name;
        this.latency = latency;
        this.throughput = throughput;
        this.packetLoss = packetLoss;
    }

    void sendMessage(Node receiver, String message) {
        Random rand = new Random();
        if (rand.nextDouble() > packetLoss) {
            System.out.println(name + " → " + receiver.name + ": " + message);
        } else {
            System.out.println("Message lost between " + name + " and " + receiver.name);
        }
    }

    void handleEvent(String event) {
        switch (event) {
            case "NodeFailure":
                System.out.println(name + " failure detected. Initiating recovery.");
                break;
            case "TransactionCommit":
                System.out.println(name + " committed transaction successfully.");
                break;
            default:
                System.out.println(name + " processing event: " + event);
        }
    }
}

public class DistributedSystem {
    public static void main(String[] args) {
        Node edge1 = new Node("Edge1", 12, 500, 0.002);
        Node core1 = new Node("Core1", 8, 1000, 0.001);

        edge1.sendMessage(core1, "RPC Call");
        core1.handleEvent("TransactionCommit");
    }
}


