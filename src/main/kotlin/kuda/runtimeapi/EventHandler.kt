package kuda.runtimeapi

class EventHandler {
    companion object {

        private var isLibraryLoaded = false

        init {
            loadLibraryIfNotLoaded()
        }

        @Synchronized
        private fun loadLibraryIfNotLoaded() {
            if (!isLibraryLoaded) {
                System.loadLibrary("kudadll")
                isLibraryLoaded = true
            }
        }

        @JvmStatic
        external fun create() : Long

        @JvmStatic
        external fun createWithFlags(flags : Int) : Long

        @JvmStatic
        external fun destroy(event : Long) : Int

        @JvmStatic
        external fun elapsedTime(start : Long, end : Long) : Float

        @JvmStatic
        external fun query(event : Long) : Int

        @JvmStatic
        external fun record(event : Long, stream : Long) : Int

        @JvmStatic
        external fun recordWithFlags(event : Long, stream : Long, flags : Int) : Int

        @JvmStatic
        external fun synchronize(event : Long) : Int

    }
}