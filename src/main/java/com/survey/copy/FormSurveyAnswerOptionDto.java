/**
 * 
 */
package com.survey.copy;


import java.util.List;

/**
 * @author amahesh9
 * DTO class w.r.t FormSurveyAnswerOption entity.
 */

public class FormSurveyAnswerOptionDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private Integer surveyAnswerOptionSequence;
	private String surveyAnswerOptionText;
	private String surveyAnswerOptionTextValue;
	private String surveyAnswerOptionImageName;
	private String surveyAnswerOptionImageNameMobile;
	private String nextQuestionCd;

	private String nextComponentCd;
	private String surveyAnswerSummaryContent;
	private List<KeyValueDto> answerOptionRules;
	
	private String nextQuestionNavigationCd;
	private String extraInfoContent;
	private String extraInfoContentMobile;
	private String extraInfoFilename;
	private String extraInfoFilenameMobile;

	private Integer assgnFormSurveyAnswerOption;
	private String outcomeValue;
	
	public String getNextComponentCd() {
		return nextComponentCd;
	}

	public void setNextComponentCd(String nextComponentCd) {
		this.nextComponentCd = nextComponentCd;
	}

	public Integer getSurveyAnswerOptionSequence() {
		return surveyAnswerOptionSequence;
	}

	public void setSurveyAnswerOptionSequence(Integer surveyAnswerOptionSequence) {
		this.surveyAnswerOptionSequence = surveyAnswerOptionSequence;
	}

	public String getSurveyAnswerOptionText() {
		return surveyAnswerOptionText;
	}

	public void setSurveyAnswerOptionText(String surveyAnswerOptionText) {
		this.surveyAnswerOptionText = surveyAnswerOptionText;
	}

	public String getSurveyAnswerOptionTextValue() {
		return surveyAnswerOptionTextValue;
	}

	public void setSurveyAnswerOptionTextValue(String surveyAnswerOptionTextValue) {
		this.surveyAnswerOptionTextValue = surveyAnswerOptionTextValue;
	}

	public String getSurveyAnswerOptionImageName() {
		return surveyAnswerOptionImageName;
	}

	public void setSurveyAnswerOptionImageName(String surveyAnswerOptionImageName) {
		this.surveyAnswerOptionImageName = surveyAnswerOptionImageName;
	}

	public String getSurveyAnswerOptionImageNameMobile() {
		return surveyAnswerOptionImageNameMobile;
	}

	public void setSurveyAnswerOptionImageNameMobile(String surveyAnswerOptionImageNameMobile) {
		this.surveyAnswerOptionImageNameMobile = surveyAnswerOptionImageNameMobile;
	}

	public String getNextQuestionCd() {
		return nextQuestionCd;
	}

	public void setNextQuestionCd(String nextQuestionCd) {
		this.nextQuestionCd = nextQuestionCd;

	}	
	public List<KeyValueDto> getAnswerOptionRules() {
		return answerOptionRules;
	}

	public void setAnswerOptionRules(List<KeyValueDto> answerOptionRules) {
		this.answerOptionRules = answerOptionRules;
	}


	public String getSurveyAnswerSummaryContent() {
		return surveyAnswerSummaryContent;
	}

	public void setSurveyAnswerSummaryContent(String surveyAnswerSummaryContent) {
		this.surveyAnswerSummaryContent = surveyAnswerSummaryContent;
	}
	
	public String getNextQuestionNavigationCd() {
		return nextQuestionNavigationCd;
	}

	public void setNextQuestionNavigationCd(String nextQuestionNavigationCd) {
		this.nextQuestionNavigationCd = nextQuestionNavigationCd;
	}		

	public String getExtraInfoContent() {
		return extraInfoContent;
	}

	public void setExtraInfoContent(String extraInfoContent) {
		this.extraInfoContent = extraInfoContent;
	}

	public String getExtraInfoContentMobile() {
		return extraInfoContentMobile;
	}

	public void setExtraInfoContentMobile(String extraInfoContentMobile) {
		this.extraInfoContentMobile = extraInfoContentMobile;
	}		

	public String getExtraInfoFilename() {
		return extraInfoFilename;
	}

	public void setExtraInfoFilename(String extraInfoFilename) {
		this.extraInfoFilename = extraInfoFilename;
	}

	public String getExtraInfoFilenameMobile() {
		return extraInfoFilenameMobile;
	}

	public void setExtraInfoFilenameMobile(String extraInfoFilenameMobile) {
		this.extraInfoFilenameMobile = extraInfoFilenameMobile;
	}
	
	public Integer getAssgnFormSurveyAnswerOption() {
		return assgnFormSurveyAnswerOption;
	}

	public void setAssgnFormSurveyAnswerOption(Integer assgnFormSurveyAnswerOption) {
		this.assgnFormSurveyAnswerOption = assgnFormSurveyAnswerOption;
	}

	public String getOutcomeValue() {
		return outcomeValue;
	}

	public void setOutcomeValue(String outcomeValue) {
		this.outcomeValue = outcomeValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nextQuestionCd == null) ? 0 : nextQuestionCd.hashCode());

		result = prime * result + ((nextComponentCd == null) ? 0 : nextComponentCd.hashCode());
		result = prime * result + ((surveyAnswerOptionImageName == null) ? 0 : surveyAnswerOptionImageName.hashCode());
		result = prime * result	+ ((surveyAnswerOptionImageNameMobile == null) ? 0 : surveyAnswerOptionImageNameMobile.hashCode());
		result = prime * result + ((surveyAnswerOptionSequence == null) ? 0 : surveyAnswerOptionSequence.hashCode());
		result = prime * result + ((surveyAnswerOptionText == null) ? 0 : surveyAnswerOptionText.hashCode());
		result = prime * result + ((surveyAnswerOptionTextValue == null) ? 0 : surveyAnswerOptionTextValue.hashCode());
		result = prime * result + ((surveyAnswerSummaryContent == null) ? 0 : surveyAnswerSummaryContent.hashCode());
		result = prime * result + ((assgnFormSurveyAnswerOption == null) ? 0 : assgnFormSurveyAnswerOption.hashCode());
		result = prime * result + ((outcomeValue == null) ? 0 : outcomeValue.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		FormSurveyAnswerOptionDto other = (FormSurveyAnswerOptionDto) obj;

		if (nextQuestionCd == null) {
			if (other.nextQuestionCd != null) {
				return false;
			}
		} else if (!nextQuestionCd.equals(other.nextQuestionCd)) {
			return false;
		}
		if (nextComponentCd == null) {
			if (other.nextComponentCd != null) {
				return false;
			}
		} else if (!nextComponentCd.equals(other.nextComponentCd)) {
			return false;
		}
		if (nextQuestionNavigationCd == null) {
			if (other.nextQuestionNavigationCd != null)
				return false;
		} else if (!nextQuestionNavigationCd.equals(other.nextQuestionNavigationCd))
			return false;
		if (surveyAnswerOptionImageName == null) {
			if (other.surveyAnswerOptionImageName != null) {
				return false;
			}
		} else if (!surveyAnswerOptionImageName.equals(other.surveyAnswerOptionImageName)) {
			return false;
		}
		if (surveyAnswerOptionImageNameMobile == null) {
			if (other.surveyAnswerOptionImageNameMobile != null) {
				return false;
			}
		} else if (!surveyAnswerOptionImageNameMobile.equals(other.surveyAnswerOptionImageNameMobile)) {
			return false;
		}
		if (surveyAnswerOptionSequence == null) {
			if (other.surveyAnswerOptionSequence != null) {
				return false;
			}
		} else if (!surveyAnswerOptionSequence.equals(other.surveyAnswerOptionSequence)) {
			return false;
		}
		if (surveyAnswerOptionText == null) {
			if (other.surveyAnswerOptionText != null) {
				return false;
			}
		} else if (!surveyAnswerOptionText.equals(other.surveyAnswerOptionText)) {
			return false;
		}
		if (surveyAnswerOptionTextValue == null) {
			if (other.surveyAnswerOptionTextValue != null) {
				return false;
			}
		} else if (!surveyAnswerOptionTextValue.equals(other.surveyAnswerOptionTextValue)) {
			return false;
		}
		if (surveyAnswerSummaryContent == null) {
			if (other.surveyAnswerSummaryContent != null) {
				return false;
			}
		} else if (!surveyAnswerSummaryContent.equals(other.surveyAnswerSummaryContent)) {
			return false;
		}
		if (assgnFormSurveyAnswerOption == null) {
			if (other.assgnFormSurveyAnswerOption != null) {
				return false;
			}
		} else if (!assgnFormSurveyAnswerOption.equals(other.assgnFormSurveyAnswerOption)) {
			return false;
		}
		
		if (outcomeValue == null) {
			if (other.outcomeValue != null) {
				return false;
			}
		} else if (!outcomeValue.equals(other.outcomeValue)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "FormSurveyAnswerOptionDto [surveyAnswerOptionSequence=" + surveyAnswerOptionSequence
				+ ", surveyAnswerOptionText=" + surveyAnswerOptionText + ", surveyAnswerOptionTextValue="
				+ surveyAnswerOptionTextValue + ", surveyAnswerOptionImageName=" + surveyAnswerOptionImageName
				+ ", surveyAnswerOptionImageNameMobile=" + surveyAnswerOptionImageNameMobile + ", nextQuestionCd="
				+ nextQuestionCd + ", nextComponentCd=" + nextComponentCd + ", surveyAnswerSummaryContent="
				+ surveyAnswerSummaryContent +", nextQuestionNavigationCd=" + nextQuestionNavigationCd + ", extraInfoContent=" + extraInfoContent
				+ ", extraInfoContentMobile=" + extraInfoContentMobile + ", extraInfoFilename=" + extraInfoFilename
				+ ", extraInfoFilenameMobile=" + extraInfoFilenameMobile + ", assgnFormSurveyAnswerOption=" + assgnFormSurveyAnswerOption + ", outcomeValue=" + outcomeValue + "]";
	}
}