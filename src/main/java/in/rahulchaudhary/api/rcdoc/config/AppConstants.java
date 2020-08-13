/*
 * MIT License
 *
 * Copyright (c) 2020 Rahul Chaudhary Official
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

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
         String DEFAULT_HOME_CONTENTS = "<h1>Apex API Docs</h2>";
         String PROJECT_DETAIL =
                "<div class='topsection'>" +
                        "<table>" +
                        /*"<tr><td>" +
                        "<img src='apex_doc_logo.png' style='border:1px solid #000;'/>" +
                        "</td>" + */
                        "<td>" +
                        "<h2 style='margin:0px;'>Apex API Docs</h2>";
                        
}
