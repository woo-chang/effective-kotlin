package item36.progress

abstract class LoaderWithProgress {
    abstract fun innerLoad()
    fun load() {
        //프로그레스 바를 보여줌
        innerLoad()
        //프로그레스 바를 숨김
    }
}

class ProfileLoader : LoaderWithProgress() {
    override fun innerLoad() {
        //프로파일을 읽음
    }
}

class ImageLoader : LoaderWithProgress() {
    override fun innerLoad() {
        //이미지를 읽음
    }
}
