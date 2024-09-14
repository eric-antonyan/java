public class Fish implements Prey, Predetator {
    @Override
    public void flee() {
        // TODO Auto-generated method stub
        System.out.println("*This fish is fleeing from a larger fish*");
    }

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        System.out.println("*This fish hunting smaller fish*");
    }
}
