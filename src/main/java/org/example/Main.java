package org.example;

import com.t4a.processor.AIProcessingException;
import com.t4a.processor.ActionProcessor;
import lombok.extern.java.Log;

@Log
public class Main {

    /**
     * Execute this with following prompts
     * "Create a new namespace named 'development'."
     * "Deploy the latest version of the 'nginx' container in the 'production' namespace."
     * "Update the 'backend' deployment in the 'staging' namespace to use the image 'backend:v2'."
     *  "Show me all pods in the 'development' namespace."
     *  "Show me the logs from the 'backend-12345' pod in the 'production' namespace."
     * @param args
     * @throws AIProcessingException
     */
    public static void main(String[] args) throws AIProcessingException {
        ActionProcessor processor = new ActionProcessor();
        log.info(processor.processSingleAction("can you provide me list of core V1 component status","listCoreV1ConfigMapForAllNamespaces").toString());
    }
}