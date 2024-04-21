package item36.compositionprogress

class Progress {
    fun showProgress() { /* show progress */
    }

    fun hideProgress() { /* hide progress */
    }
}

class ProfileLoader {
    val progress = Progress()

    fun load() {
        progress.showProgress()
        //프로파일을 읽음
        progress.hideProgress()
    }
}

class ImageLoader {
    val progress = Progress()

    fun load() {
        progress.showProgress()
        //이미지를 읽음
        progress.hideProgress()
    }
}
