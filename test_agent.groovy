import org.moqui.adk.AdkManager
import org.moqui.context.ExecutionContextFactory

AdkManager.lazyInit(ec.factory)
def events = AdkManager.runAgent("SystemSupport", "test-session-123", "amsterdam time?")
println "Events size: " + events.size()
events.each { println it }
