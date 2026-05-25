import org.moqui.context.ExecutionContext
import org.moqui.Moqui
ExecutionContext ec = Moqui.getExecutionContext()
ec.user.internalLoginUser("SystemSupport")
def startTime = System.currentTimeMillis()
def result = ec.service.sync().name("McpServices.mcp#ResourcesList").call()
def time = System.currentTimeMillis() - startTime
println "ResourcesList took ${time} ms. Returned ${result.resources?.size()} resources."
