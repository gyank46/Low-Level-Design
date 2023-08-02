public class YouTubeLibImplProxy implements YouTubeLib{
    private YouTubeLib youTubeLib;

    public YouTubeLibImplProxy(YouTubeLib youTubeLib) {
        this.youTubeLib = youTubeLib;
    }

    @Override
    public void listVideos() {
        // do some checks or modify Data
        youTubeLib.listVideos();
    }

    @Override
    public void getVideoInfo(String id) {
        // do some action and then if needed call youtubelib
        youTubeLib.getVideoInfo(id);
    }

    @Override
    public void downloadVideo(String id) {
        // do some action and then if needed call youtubelib
        youTubeLib.downloadVideo(id);
    }
}
