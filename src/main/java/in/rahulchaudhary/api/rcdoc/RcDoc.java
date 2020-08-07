package in.rahulchaudhary.api.rcdoc;

import in.rahulchaudhary.api.rcdoc.config.ArgConf;
import in.rahulchaudhary.api.rcdoc.service.IDocProcessor;
import in.rahulchaudhary.api.rcdoc.service.impl.DocProcessor;

import java.util.Map;

public class RcDoc {

    public static void main(String[] args) {
        IDocProcessor docProcessor = new DocProcessor();
        if(args!=null && args.length>0) {
            try {
                docProcessor.processApexDoc(args, null);
            }
            catch(Exception ex) {
                System.out.println("Exception occured : message : "+ ex.getMessage());
                ex.printStackTrace();
                System.out.println("\n");
                docProcessor.printHelp();
            }
        }
        else {
            docProcessor.printHelp();
        }
    }
}
