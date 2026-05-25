import org.moqui.context.ExecutionContext
import org.moqui.Moqui
import groovy.json.JsonOutput
ExecutionContext ec = Moqui.getExecutionContext()
ec.user.internalLoginUser("SystemSupport")
def result = ec.service.sync().name("McpServices.mcp#ResourcesList").call()
def json = JsonOutput.toJson(result)
println "JSON length: ${json.length()}"
println "Snippet: ${json.substring(0, Math.min(200, json.length()))}"
