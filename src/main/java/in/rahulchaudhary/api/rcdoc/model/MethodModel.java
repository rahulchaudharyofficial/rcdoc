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

package in.rahulchaudhary.api.rcdoc.model;

import in.rahulchaudhary.api.rcdoc.util.AppUtils;

import java.util.ArrayList;

public class MethodModel extends ApexModel {
    public MethodModel() {
        params = new ArrayList<String>();
    }

    public void setNameLine(String nameLine, int iLine) {
        // remove anything after the parameter list
        if (nameLine != null) {
            int i = nameLine.lastIndexOf(")");
            if (i >= 0)
                nameLine = nameLine.substring(0, i + 1);
        }
        super.setNameLine(nameLine, iLine);
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public void setParams(ArrayList<String> params) {
        this.params = params;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getMethodName() {
        String nameLine = getNameLine().trim();
        if (nameLine != null && nameLine.length() > 0) {
            int lastindex = nameLine.indexOf("(");
            if (lastindex >= 0) {
                String methodName = AppUtils.strPrevWord(nameLine, lastindex);
                return methodName;
            }
        }
        return "";
    }

    private ArrayList<String> params;
    private String returnType;
}
