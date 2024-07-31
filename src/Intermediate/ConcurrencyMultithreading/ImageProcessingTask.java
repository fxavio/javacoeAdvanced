package Intermediate.ConcurrencyMultithreading;

class ImageProcessingTask implements Runnable {
    private final String imageName;
    public ImageProcessingTask(String imageName) {
        this.imageName = imageName;
    }
    @Override
    public void run() {
        System.out.println("Processing " + imageName);
        // Simulate image processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + imageName);
    }
}
