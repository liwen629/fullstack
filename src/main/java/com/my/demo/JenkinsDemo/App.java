package com.my.demo.JenkinsDemo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Build;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException, IOException
    {
       
    	JenkinsServer jenkins = new JenkinsServer(new URI("http://localhost:8080"), "kevin", "Passw0rd");
    	Map<String, Job> jobs = jenkins.getJobs();
        JobWithDetails job = jobs.get("Demo").details();
        
        Build lastbuild=job.getLastBuild();
 
        System.out.println(lastbuild.getNumber());
      
    	
    	

    }
}
