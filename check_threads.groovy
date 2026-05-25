def threads = Thread.getAllStackTraces()
threads.each { thread, stack ->
    if (thread.name.startsWith("Thread-")) {
        println "Thread: ${thread.name} (${thread.state})"
        if (stack.size() > 0) println "  at ${stack[0]}"
    }
}
