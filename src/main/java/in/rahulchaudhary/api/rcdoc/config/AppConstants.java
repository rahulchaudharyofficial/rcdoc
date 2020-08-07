package in.rahulchaudhary.api.rcdoc.config;

import java.util.Map;

public interface AppConstants {
    String APEX_CLASS_GLOBAL_SCOPE = "global";
    String APEX_CLASS_PUBLIC_SCOPE = "public";
    String APEX_CLASS_WEBSERVICE_SCOPE = "webservice";
    String[] DEFAULT_REGISTERED_SCOPE = {
            APEX_CLASS_GLOBAL_SCOPE,
            APEX_CLASS_PUBLIC_SCOPE,
            APEX_CLASS_WEBSERVICE_SCOPE
    };
    String ERROR_MSG="Required params are missing or null";
    String HEADER_OPEN = "<html><head>" +
                "<script type='text/javascript' src='jquery-1.11.1.js'></script>" +
                "<script type='text/javascript' src='CollapsibleList.js'></script>" +
                "<script type='text/javascript' src='ApexDoc.js'></script>" +
                "<link rel='stylesheet' type='text/css' href='ApexDoc.css' /> " +
                "</head>" +
                "<body>";

         String HEADER_CLOSE =
                "</td>" +
                        "</tr>" +
                        "</table>" +
                        "</div>";

         String FOOTER = "</div></div></td></tr></table><hr/>" +
                "<center style='font-size:.8em;'><a href='https://github.com/rahulchaudharyofficial/rcdoc' target='_blank'>Powered By Innovation</a>" +
                "</center></body></html>";

         String ROOT_DIRECTORY = "ApexDocumentation";
         String DEFAULT_HOME_CONTENTS = "<h1>Project Home</h2>";
         String PROJECT_DETAIL =
                "<div class='topsection'>" +
                        "<table>" +
                        /*"<tr><td>" +
                        "<img src='apex_doc_logo.png' style='border:1px solid #000;'/>" +
                        "</td>" + */
                        "<td>" +
                        "<h2 style='margin:0px;'>Project Demo</h2>" +
                        "Check out the project at:<br/>" +
                        "<a href='https://github.com/rahulchaudharyofficial/rcdoc'>GitHub</a><br/>";
}
