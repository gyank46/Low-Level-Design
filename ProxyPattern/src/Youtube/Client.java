package Youtube;

public class Client {

    public static void main(String[] args) {
        YouTubeLibImplProxy youTubeLibImplProxy = new YouTubeLibImplProxy();
        youTubeLibImplProxy.downloadVideo("random");
        youTubeLibImplProxy.getVideoInfo("random");
        youTubeLibImplProxy.listVideos();
    }


}
