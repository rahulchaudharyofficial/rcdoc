package in.rahulchaudhary.api.rcdoc.service;

import in.rahulchaudhary.api.rcdoc.component.IProgressMonitor;
import in.rahulchaudhary.api.rcdoc.config.ArgConf;
import in.rahulchaudhary.api.rcdoc.exception.ConstraintViolationException;
import in.rahulchaudhary.api.rcdoc.model.ClassGroup;
import in.rahulchaudhary.api.rcdoc.model.ClassModel;
import in.rahulchaudhary.api.rcdoc.model.MethodModel;
import in.rahulchaudhary.api.rcdoc.model.PropertyModel;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public interface IDocProcessor {
    void processApexDoc(String[] args, IProgressMonitor progressMonitor) throws ConstraintViolationException;
    Map<ArgConf,String> argProcessor(String[] argv);
    void printHelp();
    void fillPropertyModel(PropertyModel propertyModel, String name, ArrayList<String> lstComments,
                           int iLine);
    void fillMethodModel(MethodModel mModel, String name, ArrayList<String> lstComments, int iLine);
    void fillClassModel(ClassModel cModelParent, ClassModel cModel, String name,
                        ArrayList<String> lstComments, int iLine);

    int countChars(String str, char ch);
    ClassModel parseFileContents(String filePath);
    TreeMap<String, ClassGroup> createMapGroupNameToClassGroup(ArrayList<ClassModel> cModels,
                                                               String sourceDirectory);

}
