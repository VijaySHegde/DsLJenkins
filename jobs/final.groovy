import groovy.json.*

def jS = new JsonSlurper()
 def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/testseed/sample.json"),"UTF-8"))
def data = jS.parse(reader)  
String j1=data.ci.jobs.job.job_name
String j2=j1.replace("[","");
String job=j2.replace("]","");

String j=data.ci.jobs.job.dsl_fileName
println(j)

String j3=j.replace("[","");
String dsl=j3.replace("]","");
println(dsl)

class jobname(){
def greet(){
job_name=job
}
}

path="/var/lib/jenkins/workspace/testseed/"+dsl
println(path)
//context.testCase.setPropertyValue('JOB_NAME', 'jobname')
evaluate(new File(path))
