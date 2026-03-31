class Chef extends Thread {

    private String dish;
    private int cookingTime; // in milliseconds

    Chef(String name, String dish, int cookingTime) {
        super(name);   // set thread name
        this.dish = dish;
        this.cookingTime = cookingTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dish);

        try {
            int[] progress = {25, 50, 75, 100};

            for (int p : progress) {
                Thread.sleep(cookingTime / 4);
                System.out.println(getName() + " preparing " + dish +
                        ": " + p + "% complete");
            }

            System.out.println(getName() + " completed " + dish);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
