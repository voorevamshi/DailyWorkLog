/**
 * 
 */
package com.survey.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.util.ObjectUtils;


/**
 * @author amahesh9
 * Util class to mapped entities data to dto objects.
 */

public class CopyToFormSurveyEntityUtil {
	

	
	private CopyToFormSurveyEntityUtil() {
		//Hide the implementation of the class.
	}
		
	public static FormSurveyDto populateFormSurveyDetails(List formSurveyList) {		
		System.out.println("Started mapping of entities to Dto object");
		FormSurveyDto formSurveyDto = new FormSurveyDto();		
		try {			
			if (!ObjectUtils.isEmpty(formSurveyList)) {				
				Map<String,FormSurveyComponentDto> formSurveyComponentDtoMap = new LinkedHashMap<>();				
				for (Object formSurvey : formSurveyList) {
					 Object[] formSurveyArr = (Object[]) formSurvey;					 
					 if (formSurveyDto.getFormSurveyName() == null && formSurveyDto.getFormSurveyDescription() == null) {
						 formSurveyDto.setFormSurveyName((String) formSurveyArr[0]);
						 formSurveyDto.setFormSurveyVersion((String) formSurveyArr[1]);
						 formSurveyDto.setFormSurveyDescription((String) formSurveyArr[2]);
						 formSurveyDto.setSurveyCd((String) formSurveyArr[3]);
						 formSurveyDto.setEffectiveDt((String)formSurveyArr[4]);
						 formSurveyDto.setSurveyButtonInd((String) formSurveyArr[5]);
					 }					 
					 populateRowData(formSurveyArr,formSurveyComponentDtoMap);					 
				}
				
				int questionCounter = 0;
				for (FormSurveyComponentDto dto : formSurveyComponentDtoMap.values())  {
					if (!ObjectUtils.isEmpty(dto.getFormSurveyQuestionDtoList())) {
						questionCounter += dto.getFormSurveyQuestionDtoList().size();
					}					
				}		            
				formSurveyDto.setNumOfQuestions(questionCounter);
				
				List<FormSurveyComponentDto> formSurveyComponentDtoList = formSurveyComponentDtoMap.values().stream().collect(Collectors.toList());
				processFormSurveyComponentDtoList(formSurveyComponentDtoList);

				formSurveyDto.setFormSurveyComponentDtoList(formSurveyComponentDtoList);

			}
		} catch (Exception ex) {			
			ex.printStackTrace();
			System.out.println("Something went wrong in populateFormSurveyDetails entities mapping : "+ex);
		}
		return formSurveyDto;		
	}

	private static void processFormSurveyComponentDtoList(List<FormSurveyComponentDto> formSurveyComponentDtoList) {
	    Map<Integer, Map<Integer, String>> questionAnswerMap = getQuestionAnswerMap(formSurveyComponentDtoList);
	 
	    for (FormSurveyComponentDto componentDto : formSurveyComponentDtoList) {
	        System.out.println("Processing FormSurveyComponentDto: " + componentDto);
	        List<FormSurveyQuestionDto> questionDtoList = componentDto.getFormSurveyQuestionDtoList();
	        if (questionDtoList != null) {
	            for (FormSurveyQuestionDto questionDto : questionDtoList) {
	                System.out.println("Processing FormSurveyQuestionDto: " + questionDto);
	                List<FormSurveyAnswerOptionDto> answerOptionDtoList = questionDto.getFormSurveyAnswerOptionDetailDtoList();
	                if (answerOptionDtoList != null) {
	                    FormSurveyAnswerCombinationDetail combinationDetail = questionDto.getFormSurveyAnswerCombinationDetail();
	                    if (combinationDetail != null) {
	                        System.out.println("Processing FormSurveyAnswerCombinationDetail: " + combinationDetail);
	                        List<FormSurveyQuestionAnswerOptionComboDto> comboDtoList = combinationDetail.getFormSurveyQuestionAnswerOptionComboDtoList();
	                        if (comboDtoList != null) {
	                            for (FormSurveyQuestionAnswerOptionComboDto comboDto : comboDtoList) {
	                                System.out.println("Setting answerCombinationText for FormSurveyQuestionAnswerOptionComboDto: " + comboDto);
	                                Map<String, String> answerCombinationText = new HashMap<>();
	                                for (String answerId : comboDto.getAnswerCombination()) {
	                                    Integer answerIdInt = Integer.parseInt(answerId.trim());
	                                    if (questionAnswerMap.containsKey(questionDto.getAssgnFormSurveyQuestion()) &&
	                                        questionAnswerMap.get(questionDto.getAssgnFormSurveyQuestion()).containsKey(answerIdInt)) {
	                                        answerCombinationText.put(answerId.trim(), questionAnswerMap.get(questionDto.getAssgnFormSurveyQuestion()).get(answerIdInt));
	                                    }
	                                }
	                                comboDto.setAnswerCombinationText(answerCombinationText);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
	}

	public static Map<Integer, Map<Integer, String>> getQuestionAnswerMap(List<FormSurveyComponentDto> formSurveyComponentDtoList) {
		Map<Integer, Map<Integer, String>> questionAnswerMap = new HashMap<>();

		for (FormSurveyComponentDto componentDto : formSurveyComponentDtoList) {
			List<FormSurveyQuestionDto> questionDtoList = componentDto.getFormSurveyQuestionDtoList();
			if (questionDtoList != null) {
				for (FormSurveyQuestionDto questionDto : questionDtoList) {
					Map<Integer, String> answerMap = new HashMap<>();
					List<FormSurveyAnswerOptionDto> answerOptionDtoList = questionDto.getFormSurveyAnswerOptionDetailDtoList();
					if (answerOptionDtoList != null) {
						for (FormSurveyAnswerOptionDto answerOptionDto : answerOptionDtoList) {
							answerMap.put(answerOptionDto.getAssgnFormSurveyAnswerOption(), answerOptionDto.getSurveyAnswerOptionText());
						}
					}
					questionAnswerMap.put(questionDto.getAssgnFormSurveyQuestion(), answerMap);
				}
			}
		}

		return questionAnswerMap;
	}

	public static FormSurveyDto populateFormSurveyDetails(List<Object[]> formSurveyList,String s) {		
		System.out.println("Started mapping of entities to Dto object");
		FormSurveyDto formSurveyDto = new FormSurveyDto();		
		try {			
			if (!ObjectUtils.isEmpty(formSurveyList)) {				
				Map<String,List<FormSurveyComponentDto>> formSurveyComponentDtoMap = new HashMap<>();
				 List<Object[]> formSurveyNew=( List<Object[]>) formSurveyList;
				
				 	boolean isNewComp=false;
					boolean isNewQues=false;
					FormSurveyComponentDto fscDto = null;
					FormSurveyQuestionDto fsqDto = null;
					List<FormSurveyQuestionDto> formSurveyQuestionDtoList = null;
					List<FormSurveyAnswerOptionDto> formSurveyAnswerOptionDetailDtoList = null;	
				 	
					 Map<Object, List<Object[]>> rowdata=formSurveyNew.stream()
							 .collect(Collectors .groupingBy(r->r[5]));
					
				for (Entry<Object, List<Object[]>> entry : rowdata.entrySet()) {
					
					  isNewComp=true;
					  
					  HashMap<Object, List<Object[]>> questionRowdata = new HashMap<Object, List<Object[]>>();
					 
					  for (Object[] r : entry.getValue()) {
						  
						  
						  if (!questionRowdata.containsKey(r[13])) {
						      List<Object[]> list = new ArrayList<Object[]>();
						      list.add(r);

						      questionRowdata.put(r[13], list);
						  } else {
							  questionRowdata.get(r[13]).add(r);
						  }
						  
					  }
					
					 for (Entry<Object, List<Object[]>> quesEntry : questionRowdata.entrySet()) {
						 
							isNewQues=true;
							
							for (Object[] rowData : quesEntry.getValue()) {
						
									if(isNewComp) {
										
										isNewComp=false;
										String parntkey=null;
										parntkey=rowData[10]!=null?(String)rowData[10]:parntkey;
										//add child component
										fscDto = new FormSurveyComponentDto();
										fscDto.setComponentCd((String) rowData[5]);
										fscDto.setparentComponentCd(parntkey);
										fscDto.setComponentDesc((String) rowData[6]);
										fscDto.setComponentSequence((Integer) rowData[7]);
										fscDto.setBackgroundImageName((String) rowData[8]);
										fscDto.setBackgroundImageNameMobile((String) rowData[9]);
										fscDto.setComponentColorMobile((String)rowData[11]);
										fscDto.setComponentSummaryContent((String)rowData[12]);
					
										formSurveyQuestionDtoList = new ArrayList<>();	
										fscDto.setFormSurveyQuestionDtoList(formSurveyQuestionDtoList);
										List<FormSurveyComponentDto> compList=formSurveyComponentDtoMap.get(parntkey);
										
										if(compList==null)
										{
											compList=new ArrayList<>();
											formSurveyComponentDtoMap.put(parntkey, compList);
											
										}
										compList.add(fscDto);
							
							
						}
						
						if(isNewQues&&rowData[14]!=null)
						{
							isNewQues=false;
							 fsqDto = new FormSurveyQuestionDto();
							 formSurveyQuestionDtoList.add(fsqDto);
							 
							fsqDto.setAssgnFormSurveyQuestion((Integer) rowData[13]);
							fsqDto.setSurveyQuestionCd((String) rowData[14]);
							fsqDto.setSurveyQuestionText((String) rowData[15]);
							fsqDto.setSupplementalQuestionText((String) rowData[16]);
							fsqDto.setSurveyQuestionDisplaySeq((Integer) rowData[17]);		
							fsqDto.setSurveyFieldIdentifier((String) rowData[18]);
							fsqDto.setMaxAnswerLength((Integer) rowData[19]);
							fsqDto.setAnswerTypeCd((String) rowData[25]);
							fsqDto.setAnswerTypeDescription((String) rowData[26]);
							fsqDto.setAnswerWidgetType((String) rowData[27]);
							fsqDto.setAnswerRuleDescription((String) rowData[28]);
							
							 formSurveyAnswerOptionDetailDtoList = new ArrayList<>();
							 fsqDto.setFormSurveyAnswerOptionDetailDtoList(formSurveyAnswerOptionDetailDtoList);
						}
							
						
							if (rowData[29] != null && rowData[30] != null && rowData[31] != null) {
								
								FormSurveyAnswerOptionDto fsaoDto = new FormSurveyAnswerOptionDto();
								fsaoDto.setSurveyAnswerOptionSequence((Integer) rowData[29]);
								fsaoDto.setSurveyAnswerOptionText((String) rowData[30]);			
								fsaoDto.setSurveyAnswerOptionTextValue((String) rowData[31]);
								fsaoDto.setSurveyAnswerOptionImageName((String) rowData[32]);
								fsaoDto.setSurveyAnswerOptionImageNameMobile((String) rowData[33]);
								fsaoDto.setNextComponentCd((String) rowData[34]);
								fsaoDto.setNextQuestionCd((String) rowData[35]);
								
								formSurveyAnswerOptionDetailDtoList.add(fsaoDto);				
								
							}
						}
					 }
					
				}
					
			List<FormSurveyComponentDto> x=formSurveyComponentDtoMap.get(null);
			
			List<FormSurveyComponentDto> survyCompList=new ArrayList<FormSurveyComponentDto>();
		for (FormSurveyComponentDto parent : x) {
	
			survyCompList.add(parent);
			setChild(formSurveyComponentDtoMap,parent);
		}
		sortComponentList(survyCompList);
		formSurveyDto.setFormSurveyComponentDtoList(survyCompList);
			}
		} catch (Exception ex) {
			System.out.println(ex);
}
		return formSurveyDto;		
	}	
		
		
	private static void populateRowData(Object[] rowData,Map<String,FormSurveyComponentDto> formSurveyComponentDtoMap) {		
		FormSurveyComponentDto fscDto = null;
		FormSurveyQuestionDto fsqDto = null;
		List<FormSurveyQuestionDto> formSurveyQuestionDtoList = null;
		List<FormSurveyAnswerOptionDto> formSurveyAnswerOptionDetailDtoList = null;
		List<FormSurveyQuestionAnswerOptionComboDto> fsqaocDtoList = null;
		try {
			if (ObjectUtils.isEmpty(formSurveyComponentDtoMap)) {
				fscDto = new FormSurveyComponentDto();
				fscDto.setComponentCd((String) rowData[6]);
				fscDto.setComponentDesc((String) rowData[7]);
				fscDto.setComponentSequence((Integer) rowData[8]);
				fscDto.setBackgroundImageName((String) rowData[9]);
				fscDto.setBackgroundImageNameMobile((String) rowData[10]);
				fscDto.setComponentColor((String)rowData[11]);
				fscDto.setComponentColorMobile((String)rowData[12]);
				fscDto.setComponentSummaryContent((String)rowData[13]);
				
				formSurveyQuestionDtoList = new ArrayList<>();
				fsqDto = new FormSurveyQuestionDto();
				
				fsqDto.setAssgnFormSurveyQuestion((Integer) rowData[14]);
				fsqDto.setSurveyQuestionCd((String) rowData[15]);
				fsqDto.setSurveyQuestionText((String) rowData[16]);
				fsqDto.setSurveyQuestionTextMobile((String) rowData[17]);
				fsqDto.setSurveyQuestionDisplaySeq((Integer) rowData[18]);		
				fsqDto.setSurveyFieldIdentifier((String) rowData[19]);		
				fsqDto.setMaxAnswerLength((Integer) rowData[20]);
				fsqDto.setNavigationOverride((String) rowData[21]);				
				//fsqDto.setAutoNavigate((String) rowData[22]);
				fsqDto.setAutoNavigate(String.valueOf(rowData[22]));
				fsqDto.setSupplementalQuestionText((String) rowData[23]);
				fsqDto.setSupplementalQuestionTextMobile((String) rowData[24]);
				fsqDto.setQuestionButtonInd((String) rowData[25]);
												
				fsqDto.setAnswerTypeCd((String) rowData[26]);
				fsqDto.setAnswerTypeDescription((String) rowData[27]);
				fsqDto.setAnswerWidgetType((String) rowData[28]);
				fsqDto.setAnswerRuleDescription((String) rowData[29]);
				
				if (rowData[30] != null && rowData[31] != null && rowData[32] != null) {
					formSurveyAnswerOptionDetailDtoList = new ArrayList<>();
					FormSurveyAnswerOptionDto fsaoDto = new FormSurveyAnswerOptionDto();
					fsaoDto.setSurveyAnswerOptionSequence((Integer) rowData[30]);
					fsaoDto.setSurveyAnswerOptionText((String) rowData[31]);			
					fsaoDto.setSurveyAnswerOptionTextValue((String) rowData[32]);
					fsaoDto.setSurveyAnswerOptionImageName((String) rowData[33]);
					fsaoDto.setSurveyAnswerOptionImageNameMobile((String) rowData[34]);
					fsaoDto.setNextQuestionCd((String) rowData[35]);
					fsaoDto.setSurveyAnswerSummaryContent((String) rowData[36]);
					fsaoDto.setNextQuestionNavigationCd((String) rowData[37]);
					fsaoDto.setNextComponentCd((String) rowData[38]);
					fsaoDto.setAssgnFormSurveyAnswerOption((Integer) rowData[39]);
					fsaoDto.setOutcomeValue((String) rowData[40]);

					formSurveyAnswerOptionDetailDtoList.add(fsaoDto);				
					fsqDto.setFormSurveyAnswerOptionDetailDtoList(formSurveyAnswerOptionDetailDtoList);
				}
				processRowData(rowData, fsqDto);
				
				formSurveyQuestionDtoList.add(fsqDto);
				fscDto.setFormSurveyQuestionDtoList(formSurveyQuestionDtoList);						
				
				formSurveyComponentDtoMap.put((String) rowData[6], fscDto);				
			} 
		else {
				if (formSurveyComponentDtoMap.containsKey((String) rowData[6])) {					
					fscDto = formSurveyComponentDtoMap.get((String) rowData[6]);
					formSurveyQuestionDtoList = fscDto.getFormSurveyQuestionDtoList();
					
					fsqDto = new FormSurveyQuestionDto();				
					fsqDto.setAssgnFormSurveyQuestion((Integer) rowData[14]);
					fsqDto.setSurveyQuestionCd((String) rowData[15]);
					fsqDto.setSurveyQuestionText((String) rowData[16]);
					fsqDto.setSurveyQuestionTextMobile((String) rowData[17]);
					fsqDto.setSurveyQuestionDisplaySeq((Integer) rowData[18]);		
					fsqDto.setSurveyFieldIdentifier((String) rowData[19]);		
					fsqDto.setMaxAnswerLength((Integer) rowData[20]);
					fsqDto.setNavigationOverride((String) rowData[21]);					
					fsqDto.setAutoNavigate(String.valueOf(rowData[22]));
					fsqDto.setSupplementalQuestionText((String) rowData[23]);
					fsqDto.setSupplementalQuestionTextMobile((String) rowData[24]);
					fsqDto.setQuestionButtonInd((String) rowData[25]);
					
					fsqDto.setAnswerTypeCd((String) rowData[26]);
					fsqDto.setAnswerTypeDescription((String) rowData[27]);
					fsqDto.setAnswerWidgetType((String) rowData[28]);
					fsqDto.setAnswerRuleDescription((String) rowData[29]);
															
					boolean isQuestionExist = false;
					for (ListIterator<FormSurveyQuestionDto> listIterator = formSurveyQuestionDtoList.listIterator(); listIterator.hasNext();) {
						  FormSurveyQuestionDto obj = listIterator.next();						  
						  if ((obj.getAssgnFormSurveyQuestion()).equals(fsqDto.getAssgnFormSurveyQuestion())) {
					    	  isQuestionExist = true;					    	  
					    	  if (rowData[30] != null && rowData[31] != null && rowData[32] != null) {
					    		    formSurveyAnswerOptionDetailDtoList = obj.getFormSurveyAnswerOptionDetailDtoList();
					    			//Start
								  	boolean isAnswerOptionExist = false;
								  	for (ListIterator<FormSurveyAnswerOptionDto> listIteratorFsaoDto = formSurveyAnswerOptionDetailDtoList.listIterator(); listIteratorFsaoDto.hasNext();) {
								  	    FormSurveyAnswerOptionDto fsaoDto = listIteratorFsaoDto.next();
								  	    if ((fsaoDto.getAssgnFormSurveyAnswerOption()).equals((Integer) rowData[39])) { //735
								  	        isAnswerOptionExist = true;
										processCombinationDetail(rowData, obj);
								  	      break;
								  	    }
								  	}
								  	if (!isAnswerOptionExist) {
								  		FormSurveyAnswerOptionDto fsaoDto = new FormSurveyAnswerOptionDto();
										fsaoDto.setSurveyAnswerOptionSequence((Integer) rowData[30]);
										fsaoDto.setSurveyAnswerOptionText((String) rowData[31]);			
										fsaoDto.setSurveyAnswerOptionTextValue((String) rowData[32]);
										fsaoDto.setSurveyAnswerOptionImageName((String) rowData[33]);
										fsaoDto.setSurveyAnswerOptionImageNameMobile((String) rowData[34]);
										fsaoDto.setNextQuestionCd((String) rowData[35]);
										fsaoDto.setSurveyAnswerSummaryContent((String) rowData[36]);
										fsaoDto.setNextQuestionNavigationCd((String) rowData[37]);
										fsaoDto.setNextComponentCd((String) rowData[38]);
									  	fsaoDto.setAssgnFormSurveyAnswerOption((Integer) rowData[39]);
									  	fsaoDto.setOutcomeValue((String) rowData[40]);
										formSurveyAnswerOptionDetailDtoList.add(fsaoDto);
										processRowData(rowData, obj);
								  	}
								  	//End
								}				    	  
					    	  break;
					      }
					}					
					if (!isQuestionExist) {						
						if (rowData[30] != null && rowData[31] != null && rowData[32] != null) {
							formSurveyAnswerOptionDetailDtoList = new ArrayList<>();
							FormSurveyAnswerOptionDto fsaoDto = new FormSurveyAnswerOptionDto();
							fsaoDto.setSurveyAnswerOptionSequence((Integer) rowData[30]);
							fsaoDto.setSurveyAnswerOptionText((String) rowData[31]);			
							fsaoDto.setSurveyAnswerOptionTextValue((String) rowData[32]);
							fsaoDto.setSurveyAnswerOptionImageName((String) rowData[33]);
							fsaoDto.setSurveyAnswerOptionImageNameMobile((String) rowData[34]);
							fsaoDto.setNextQuestionCd((String) rowData[35]);
							fsaoDto.setSurveyAnswerSummaryContent((String) rowData[36]);
							fsaoDto.setNextQuestionNavigationCd((String) rowData[37]);
							fsaoDto.setNextComponentCd((String) rowData[38]);
							fsaoDto.setAssgnFormSurveyAnswerOption((Integer) rowData[39]);
							fsaoDto.setOutcomeValue((String) rowData[40]);

							formSurveyAnswerOptionDetailDtoList.add(fsaoDto);				
							fsqDto.setFormSurveyAnswerOptionDetailDtoList(formSurveyAnswerOptionDetailDtoList);																			
						}
						
						formSurveyQuestionDtoList.add(fsqDto);
						processRowData(rowData, fsqDto);
					}
					
				}
				else {				
					fscDto = new FormSurveyComponentDto();
					fscDto.setComponentCd((String) rowData[6]);
					fscDto.setComponentDesc((String) rowData[7]);
					fscDto.setComponentSequence((Integer) rowData[8]);
					fscDto.setBackgroundImageName((String) rowData[9]);
					fscDto.setBackgroundImageNameMobile((String) rowData[10]);
					fscDto.setComponentColor((String)rowData[11]);
					fscDto.setComponentColorMobile((String)rowData[12]);
					fscDto.setComponentSummaryContent((String)rowData[13]);
					
					formSurveyQuestionDtoList = new ArrayList<>();
					fsqDto = new FormSurveyQuestionDto();
					
					fsqDto.setAssgnFormSurveyQuestion((Integer) rowData[14]);
					fsqDto.setSurveyQuestionCd((String) rowData[15]);
					fsqDto.setSurveyQuestionText((String) rowData[16]);
					fsqDto.setSurveyQuestionTextMobile((String) rowData[17]);
					fsqDto.setSurveyQuestionDisplaySeq((Integer) rowData[18]);		
					fsqDto.setSurveyFieldIdentifier((String) rowData[19]);		
					fsqDto.setMaxAnswerLength((Integer) rowData[20]);
					fsqDto.setNavigationOverride((String) rowData[21]);					
					fsqDto.setAutoNavigate(String.valueOf(rowData[22]));
					fsqDto.setSupplementalQuestionText((String) rowData[23]);
					fsqDto.setSupplementalQuestionTextMobile((String) rowData[24]);
					fsqDto.setQuestionButtonInd((String) rowData[25]);
					
					fsqDto.setAnswerTypeCd((String) rowData[26]);
					fsqDto.setAnswerTypeDescription((String) rowData[27]);
					fsqDto.setAnswerWidgetType((String) rowData[28]);
					fsqDto.setAnswerRuleDescription((String) rowData[29]);
					
					if (rowData[30] != null && rowData[31] != null && rowData[32] != null) {
						formSurveyAnswerOptionDetailDtoList = new ArrayList<>();
						FormSurveyAnswerOptionDto fsaoDto = new FormSurveyAnswerOptionDto();
						fsaoDto.setSurveyAnswerOptionSequence((Integer) rowData[30]);
						fsaoDto.setSurveyAnswerOptionText((String) rowData[31]);			
						fsaoDto.setSurveyAnswerOptionTextValue((String) rowData[32]);
						fsaoDto.setSurveyAnswerOptionImageName((String) rowData[33]);
						fsaoDto.setSurveyAnswerOptionImageNameMobile((String) rowData[34]);
						fsaoDto.setNextQuestionCd((String) rowData[35]);
						fsaoDto.setSurveyAnswerSummaryContent((String) rowData[36]);
						fsaoDto.setNextQuestionNavigationCd((String) rowData[37]);
						fsaoDto.setNextComponentCd((String) rowData[38]);
						fsaoDto.setAssgnFormSurveyAnswerOption((Integer) rowData[39]);
						fsaoDto.setOutcomeValue((String) rowData[40]);

						formSurveyAnswerOptionDetailDtoList.add(fsaoDto);
						fsqDto.setFormSurveyAnswerOptionDetailDtoList(formSurveyAnswerOptionDetailDtoList);
					}
					processRowData(rowData, fsqDto);
					formSurveyQuestionDtoList.add(fsqDto);
					fscDto.setFormSurveyQuestionDtoList(formSurveyQuestionDtoList);						
					
					formSurveyComponentDtoMap.put((String) rowData[6], fscDto);				
			}
		}
		} catch (Exception ex) {			
			System.out.println("Something went wrong in populateRowData entities mapping : "+ex);
		}
	}
	private static void processRowData(Object[] rowData, FormSurveyQuestionDto fsqDto) {
		boolean isComboExist=false;
		if (null != fsqDto.getFormSurveyAnswerCombinationDetail()
				&& null != fsqDto.getFormSurveyAnswerCombinationDetail().getFormSurveyQuestionAnswerOptionComboDtoList()
				&& !fsqDto.getFormSurveyAnswerCombinationDetail().getFormSurveyQuestionAnswerOptionComboDtoList().isEmpty()) {
			for (FormSurveyQuestionAnswerOptionComboDto formSurveyQuestionAnswerOptionComboDto : fsqDto
					.getFormSurveyAnswerCombinationDetail().getFormSurveyQuestionAnswerOptionComboDtoList()) {
				if (null != formSurveyQuestionAnswerOptionComboDto.getCombinationId() && null != rowData[41]
						&& formSurveyQuestionAnswerOptionComboDto.getCombinationId().equals((Integer) rowData[41])) {
					isComboExist=true;
					break;
				}
			}
		}
		if(!isComboExist) {
			if (rowData[41] != null && rowData[42] != null) {
				FormSurveyAnswerCombinationDetail combinationDetail = new FormSurveyAnswerCombinationDetail();
				List<FormSurveyQuestionAnswerOptionComboDto> fsqaocDtoList = new ArrayList<>();
				if (rowData[42] != null && ((String) rowData[42]).equalsIgnoreCase("DEFAULT")) {
					combinationDetail.setDefaultOutcomeValue(
							rowData[42] != null && ((String) rowData[42]).equalsIgnoreCase("DEFAULT") ? (String) rowData[43] : null);
				} else {
					FormSurveyQuestionAnswerOptionComboDto fsqaocDto = new FormSurveyQuestionAnswerOptionComboDto();
					fsqaocDto.setCombinationId((Integer) rowData[41]);
					fsqaocDto.setAssgnFormSurveyQuestion((Integer) rowData[14]);
					fsqaocDto.setAnswerCombination(rowData[42] != null ? Arrays.asList(((String) rowData[42]).split(",")) : null);
					fsqaocDto.setComboOutcomeValue((String) rowData[43]);
					fsqaocDto.setComboNextQuestionCd((String) rowData[44]);
					fsqaocDto.setComboNextQuestionNavigationCd((String) rowData[45]);
					fsqaocDto.setComboNextComponentCd((String) rowData[46]);
					fsqaocDtoList.add(fsqaocDto);
	
				}
				combinationDetail.setFormSurveyQuestionAnswerOptionComboDtoList(fsqaocDtoList);
				fsqDto.setFormSurveyAnswerCombinationDetail(combinationDetail);
			}
		}
	}

	private static void processCombinationDetail(Object[] rowData, FormSurveyQuestionDto fsqDto) {
		FormSurveyAnswerCombinationDetail combinationDetail = fsqDto.getFormSurveyAnswerCombinationDetail();
		if (combinationDetail == null) {
			combinationDetail = new FormSurveyAnswerCombinationDetail();
			fsqDto.setFormSurveyAnswerCombinationDetail(combinationDetail);
		}

		List<FormSurveyQuestionAnswerOptionComboDto> fsqaocDtoList = combinationDetail.getFormSurveyQuestionAnswerOptionComboDtoList();
		
		boolean isComboExist=false;
		if ( null != fsqaocDtoList
				&& !fsqaocDtoList.isEmpty()) {
			for (FormSurveyQuestionAnswerOptionComboDto formSurveyQuestionAnswerOptionComboDto : fsqaocDtoList) {
				if (null != formSurveyQuestionAnswerOptionComboDto.getCombinationId() && null != rowData[41]
						&& formSurveyQuestionAnswerOptionComboDto.getCombinationId().equals((Integer) rowData[41])) {
					isComboExist=true;
					break;
				}
			}
		}
	
		
		if (fsqaocDtoList == null) {
			fsqaocDtoList = new ArrayList<>();
			combinationDetail.setFormSurveyQuestionAnswerOptionComboDtoList(fsqaocDtoList);
		}
		if(!isComboExist) {
		if (rowData[42] != null && "DEFAULT".equalsIgnoreCase((String) rowData[42])) {
			combinationDetail.setDefaultOutcomeValue((String) rowData[43]);
		} else if (rowData[41] != null && rowData[42] != null) {
			FormSurveyQuestionAnswerOptionComboDto fsqaocDto = new FormSurveyQuestionAnswerOptionComboDto();
			fsqaocDto.setCombinationId((Integer) rowData[41]);
			fsqaocDto.setAssgnFormSurveyQuestion((Integer) rowData[14]);
			fsqaocDto.setAnswerCombination(Arrays.asList(((String) rowData[42]).split(",")));
			fsqaocDto.setComboOutcomeValue((String) rowData[43]);
			fsqaocDto.setComboNextQuestionCd((String) rowData[44]);
			fsqaocDto.setComboNextQuestionNavigationCd((String) rowData[45]);
			fsqaocDto.setComboNextComponentCd((String) rowData[46]);
			fsqaocDtoList.add(fsqaocDto);
		}
		}
	}

	private static void sortComponentList(List<FormSurveyComponentDto> survyCompList) {
        if (survyCompList != null) {
            survyCompList.sort(Comparator.comparing(FormSurveyComponentDto::getComponentSequence));
            for (FormSurveyComponentDto dto : survyCompList) {
                List<FormSurveyQuestionDto> queDtoList = dto.getFormSurveyQuestionDtoList();
                if (queDtoList != null) {
                    queDtoList.sort(Comparator.comparing(FormSurveyQuestionDto::getSurveyQuestionDisplaySeq));
                }
                for (FormSurveyQuestionDto formSurveyQuestionDto : queDtoList) {
                    List<FormSurveyAnswerOptionDto> optDtoList = formSurveyQuestionDto
                            .getFormSurveyAnswerOptionDetailDtoList();
                    if (optDtoList != null) {
                        optDtoList.sort(Comparator.comparing(FormSurveyAnswerOptionDto::getSurveyAnswerOptionSequence));
                    }
                }
            }
        }
    }

	private static void setChild(Map<String, List<FormSurveyComponentDto>> formSurveyComponentDtoMap,
			FormSurveyComponentDto parent) {
		 List<FormSurveyComponentDto> childList=formSurveyComponentDtoMap.get(parent.getComponentCd());
		 sortComponentList(childList);
		 parent.setChildComponent(childList);
		 if(childList!=null) {
		 for (FormSurveyComponentDto formSurveyComponentDto : childList) {
			 setChild(formSurveyComponentDtoMap,formSurveyComponentDto);
		}}
		
	}					
}