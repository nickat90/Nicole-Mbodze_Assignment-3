class DeadlockResolver {
    void resolveDeadlock() {
        System.out.println("Deadlock detected. Rolling back lowest priority transaction.");
    }
}
