package Youtube;

public class YouTubeLibImpl implements YouTubeLib{
    @Override
    public void listVideos() {
        System.out.println("Listing Videos.");
    }

    @Override
    public void getVideoInfo(String id) {
        System.out.println("Get Video Info for: "+id);
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("Download Video "+id);
    }
}
