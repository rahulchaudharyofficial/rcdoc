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

public class ApexModel {
    public String getNameLine() {
        return nameLine;
    }

    public int getInameLine() {
        return inameLine;
    }

    public void setNameLine(String nameLine, int iLine) {
        this.nameLine = nameLine.trim();
        this.inameLine = iLine;
        parseScope();
    }

    public String getDescription() {
        return description == null ? "" : description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author == null ? "" : author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date == null ? "" : date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReturns() {
        return returns == null ? "" : returns;
    }

    public void setReturns(String returns) {
        this.returns = returns;
    }

    public String getExample() {
        return example == null ? "" : example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getScope() {
        return scope == null ? "" : scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    private void parseScope() {
        scope = null;
        if (nameLine != null) {
            String str = AppUtils.strContainsScope(nameLine);
            if (str != null)
                scope = str;
        }
    }

    private String nameLine;
    private int inameLine;
    private String description;
    private String author;
    private String date;
    private String returns;
    private String scope;
    private String example;
}
