package Youtube;

public class YouTubeLibImplProxy implements YouTubeLib{


    @Override
    public void listVideos() {
        // do some checks or modify Data
        new YouTubeLibImpl().listVideos();
    }

    @Override
    public void getVideoInfo(String id) {
        // do some action and then if needed call youtubelib
        new YouTubeLibImpl().getVideoInfo(id);
    }

    @Override
    public void downloadVideo(String id) {
        // do some action and then if needed call youtubelib
        new YouTubeLibImpl().downloadVideo(id);
    }
}
