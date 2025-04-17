/**
 * 
 */
package com.survey.copy;

import java.util.List;

/**

 * @author amahesh9 DTO class w.r.t FormSurveyQuestion entity.
 */

public class FormSurveyQuestionDto extends AbstractDto {

	private static final long serialVersionUID = 1L;


	private Integer assgnFormSurveyQuestion;
	private String surveyQuestionCd;
	private String surveyQuestionText;
	private String surveyQuestionTextMobile;
	private Integer surveyQuestionDisplaySeq;
	private String surveyFieldIdentifier;
	private Integer maxAnswerLength;


	private String answerTypeCd;
	private String answerTypeDescription;
	private String answerWidgetType;
	private String answerRuleDescription;
	private String surveyAnswerSummaryContentForOther;

	private String navigationOverride;
	private String autoNavigate;
	private String supplementalQuestionText;
	private String supplementalQuestionTextMobile;
	private String questionButtonInd;

	private List<FormSurveyAnswerOptionDto> formSurveyAnswerOptionDetailDtoList;

	private FormSurveyAnswerCombinationDetail formSurveyAnswerCombinationDetail;

	public Integer getAssgnFormSurveyQuestion() {
		return assgnFormSurveyQuestion;
	}

	public void setAssgnFormSurveyQuestion(Integer assgnFormSurveyQuestion) {
		this.assgnFormSurveyQuestion = assgnFormSurveyQuestion;
	}

	public String getSurveyQuestionCd() {
		return surveyQuestionCd;
	}

	public void setSurveyQuestionCd(String surveyQuestionCd) {
		this.surveyQuestionCd = surveyQuestionCd;
	}

	public String getSurveyQuestionText() {
		return surveyQuestionText;
	}

	public void setSurveyQuestionText(String surveyQuestionText) {
		this.surveyQuestionText = surveyQuestionText;
	}

	public String getSurveyQuestionTextMobile() {
		return surveyQuestionTextMobile;
	}

	public void setSurveyQuestionTextMobile(String surveyQuestionTextMobile) {
		this.surveyQuestionTextMobile = surveyQuestionTextMobile;
	}

	public Integer getSurveyQuestionDisplaySeq() {
		return surveyQuestionDisplaySeq;
	}

	public void setSurveyQuestionDisplaySeq(Integer surveyQuestionDisplaySeq) {
		this.surveyQuestionDisplaySeq = surveyQuestionDisplaySeq;
	}

	public String getSurveyFieldIdentifier() {
		return surveyFieldIdentifier;
	}

	public void setSurveyFieldIdentifier(String surveyFieldIdentifier) {
		this.surveyFieldIdentifier = surveyFieldIdentifier;
	}

	public Integer getMaxAnswerLength() {
		return maxAnswerLength;
	}

	public void setMaxAnswerLength(Integer maxAnswerLength) {
		this.maxAnswerLength = maxAnswerLength;
	}

	public String getAnswerTypeCd() {
		return answerTypeCd;
	}

	public void setAnswerTypeCd(String answerTypeCd) {
		this.answerTypeCd = answerTypeCd;
	}

	public String getAnswerTypeDescription() {
		return answerTypeDescription;
	}

	public void setAnswerTypeDescription(String answerTypeDescription) {
		this.answerTypeDescription = answerTypeDescription;
	}

	public String getAnswerWidgetType() {
		return answerWidgetType;
	}

	public void setAnswerWidgetType(String answerWidgetType) {
		this.answerWidgetType = answerWidgetType;
	}

	public String getAnswerRuleDescription() {
		return answerRuleDescription;
	}

	public void setAnswerRuleDescription(String answerRuleDescription) {
		this.answerRuleDescription = answerRuleDescription;
	}

	public List<FormSurveyAnswerOptionDto> getFormSurveyAnswerOptionDetailDtoList() {
		return formSurveyAnswerOptionDetailDtoList;
	}


	public void setFormSurveyAnswerOptionDetailDtoList(
			List<FormSurveyAnswerOptionDto> formSurveyAnswerOptionDetailDtoList) {
		this.formSurveyAnswerOptionDetailDtoList = formSurveyAnswerOptionDetailDtoList;
	}

	public String getSurveyAnswerSummaryContentForOther() {
		return surveyAnswerSummaryContentForOther;
	}

	public void setSurveyAnswerSummaryContentForOther(String surveyAnswerSummaryContentForOther) {
		this.surveyAnswerSummaryContentForOther = surveyAnswerSummaryContentForOther;
	}


	public String getNavigationOverride() {
		return navigationOverride;
	}

	public void setNavigationOverride(String navigationOverride) {
		this.navigationOverride = navigationOverride;
	}

	public String getAutoNavigate() {
		return autoNavigate;
	}

	public void setAutoNavigate(String autoNavigate) {
		this.autoNavigate = autoNavigate;
	}

	public String getSupplementalQuestionText() {
		return supplementalQuestionText;
	}

	public void setSupplementalQuestionText(String supplementalQuestionText) {
		this.supplementalQuestionText = supplementalQuestionText;
	}

	public String getSupplementalQuestionTextMobile() {
		return supplementalQuestionTextMobile;
	}

	public void setSupplementalQuestionTextMobile(String supplementalQuestionTextMobile) {
		this.supplementalQuestionTextMobile = supplementalQuestionTextMobile;
	}

	public String getQuestionButtonInd() {
		return questionButtonInd;
	}

	public void setQuestionButtonInd(String questionButtonInd) {
		this.questionButtonInd = questionButtonInd;
	}



	public FormSurveyAnswerCombinationDetail getFormSurveyAnswerCombinationDetail() {
		return formSurveyAnswerCombinationDetail;
	}

	public void setFormSurveyAnswerCombinationDetail(FormSurveyAnswerCombinationDetail formSurveyAnswerCombinationDetail) {
		this.formSurveyAnswerCombinationDetail = formSurveyAnswerCombinationDetail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;

		int result = 1;
		result = prime * result + ((answerRuleDescription == null) ? 0 : answerRuleDescription.hashCode());
		result = prime * result + ((answerTypeCd == null) ? 0 : answerTypeCd.hashCode());
		result = prime * result + ((answerTypeDescription == null) ? 0 : answerTypeDescription.hashCode());
		result = prime * result + ((answerWidgetType == null) ? 0 : answerWidgetType.hashCode());
		result = prime * result + ((assgnFormSurveyQuestion == null) ? 0 : assgnFormSurveyQuestion.hashCode());
		result = prime * result + ((autoNavigate == null) ? 0 : autoNavigate.hashCode());
		result = prime * result
				+ ((formSurveyAnswerOptionDetailDtoList == null) ? 0 : formSurveyAnswerOptionDetailDtoList.hashCode());
		result = prime * result
				+ ((formSurveyAnswerCombinationDetail == null) ? 0 : formSurveyAnswerCombinationDetail.hashCode());
		result = prime * result + ((maxAnswerLength == null) ? 0 : maxAnswerLength.hashCode());
		result = prime * result + ((navigationOverride == null) ? 0 : navigationOverride.hashCode());
		result = prime * result + ((supplementalQuestionText == null) ? 0 : supplementalQuestionText.hashCode());
		result = prime * result
				+ ((supplementalQuestionTextMobile == null) ? 0 : supplementalQuestionTextMobile.hashCode());
		result = prime * result
				+ ((surveyAnswerSummaryContentForOther == null) ? 0 : surveyAnswerSummaryContentForOther.hashCode());
		result = prime * result + ((surveyFieldIdentifier == null) ? 0 : surveyFieldIdentifier.hashCode());
		result = prime * result + ((surveyQuestionCd == null) ? 0 : surveyQuestionCd.hashCode());
		result = prime * result + ((surveyQuestionDisplaySeq == null) ? 0 : surveyQuestionDisplaySeq.hashCode());
		result = prime * result + ((surveyQuestionText == null) ? 0 : surveyQuestionText.hashCode());
		result = prime * result + ((surveyQuestionTextMobile == null) ? 0 : surveyQuestionTextMobile.hashCode());
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
		FormSurveyQuestionDto other = (FormSurveyQuestionDto) obj;
		if (answerRuleDescription == null) {
			if (other.answerRuleDescription != null) {
				return false;
			}
		} else if (!answerRuleDescription.equals(other.answerRuleDescription)) {
			return false;
		}
		if (answerTypeCd == null) {
			if (other.answerTypeCd != null) {
				return false;
			}
		} else if (!answerTypeCd.equals(other.answerTypeCd)) {
			return false;
		}
		if (answerTypeDescription == null) {
			if (other.answerTypeDescription != null) {
				return false;
			}
		} else if (!answerTypeDescription.equals(other.answerTypeDescription)) {
			return false;
		}
		if (answerWidgetType == null) {
			if (other.answerWidgetType != null) {
				return false;
			}
		} else if (!answerWidgetType.equals(other.answerWidgetType)) {
			return false;
		}
		if (assgnFormSurveyQuestion == null) {
			if (other.assgnFormSurveyQuestion != null) {
				return false;
			}
		} else if (!assgnFormSurveyQuestion.equals(other.assgnFormSurveyQuestion)) {
			return false;
		}
		if (autoNavigate == null) {
			if (other.autoNavigate != null) {
				return false;
			}
		} else if (!autoNavigate.equals(other.autoNavigate)) {
			return false;
		}
		if (formSurveyAnswerOptionDetailDtoList == null) {
			if (other.formSurveyAnswerOptionDetailDtoList != null) {
				return false;
			}
		} else if (!formSurveyAnswerOptionDetailDtoList.equals(other.formSurveyAnswerOptionDetailDtoList)) {
			return false;
		}
		if (formSurveyAnswerCombinationDetail == null) {
			if (other.formSurveyAnswerCombinationDetail != null) {
				return false;
			}
		} else if (!formSurveyAnswerCombinationDetail.equals(other.formSurveyAnswerCombinationDetail)) {
			return false;
		}
		if (maxAnswerLength == null) {
			if (other.maxAnswerLength != null) {
				return false;
			}
		} else if (!maxAnswerLength.equals(other.maxAnswerLength)) {
			return false;
		}
		if (navigationOverride == null) {
			if (other.navigationOverride != null) {
				return false;
			}
		} else if (!navigationOverride.equals(other.navigationOverride)) {
			return false;
		}
		if (supplementalQuestionText == null) {
			if (other.supplementalQuestionText != null) {
				return false;
			}
		} else if (!supplementalQuestionText.equals(other.supplementalQuestionText)) {
			return false;
		}
		if (supplementalQuestionTextMobile == null) {
			if (other.supplementalQuestionTextMobile != null) {
				return false;
			}
		} else if (!supplementalQuestionTextMobile.equals(other.supplementalQuestionTextMobile)) {
			return false;
		}
		if (surveyAnswerSummaryContentForOther == null) {
			if (other.surveyAnswerSummaryContentForOther != null) {
				return false;
			}
		} else if (!surveyAnswerSummaryContentForOther.equals(other.surveyAnswerSummaryContentForOther)) {
			return false;
		}
		if (surveyFieldIdentifier == null) {
			if (other.surveyFieldIdentifier != null) {
				return false;
			}
		} else if (!surveyFieldIdentifier.equals(other.surveyFieldIdentifier)) {
			return false;
		}
		if (surveyQuestionCd == null) {
			if (other.surveyQuestionCd != null) {
				return false;
			}
		} else if (!surveyQuestionCd.equals(other.surveyQuestionCd)) {
			return false;
		}
		if (surveyQuestionDisplaySeq == null) {
			if (other.surveyQuestionDisplaySeq != null) {
				return false;
			}
		} else if (!surveyQuestionDisplaySeq.equals(other.surveyQuestionDisplaySeq)) {
			return false;
		}
		if (surveyQuestionText == null) {
			if (other.surveyQuestionText != null) {
				return false;
			}
		} else if (!surveyQuestionText.equals(other.surveyQuestionText)) {
			return false;
		}
		if (surveyQuestionTextMobile == null) {
			if (other.surveyQuestionTextMobile != null) {
				return false;
			}
		} else if (!surveyQuestionTextMobile.equals(other.surveyQuestionTextMobile)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FormSurveyQuestionDto [assgnFormSurveyQuestion=" + assgnFormSurveyQuestion + ", surveyQuestionCd="
				+ surveyQuestionCd + ", surveyQuestionText=" + surveyQuestionText + ", surveyQuestionTextMobile="
				+ surveyQuestionTextMobile + ", surveyQuestionDisplaySeq=" + surveyQuestionDisplaySeq
				+ ", surveyFieldIdentifier=" + surveyFieldIdentifier + ", maxAnswerLength=" + maxAnswerLength
				+ ", answerTypeCd=" + answerTypeCd + ", answerTypeDescription=" + answerTypeDescription
				+ ", answerWidgetType=" + answerWidgetType + ", answerRuleDescription=" + answerRuleDescription
				+ ", surveyAnswerSummaryContentForOther=" + surveyAnswerSummaryContentForOther + ", navigationOverride="
				+ navigationOverride + ", autoNavigate=" + autoNavigate + ", supplementalQuestionText="
				+ supplementalQuestionText + ", questionButtonInd=" + questionButtonInd +" supplementalQuestionTextMobile=" + supplementalQuestionTextMobile
				+ ", formSurveyAnswerOptionDetailDtoList=" + formSurveyAnswerOptionDetailDtoList
				+ ", formSurveyAnswerCombinationDetail=" + formSurveyAnswerCombinationDetail + "]";
	}
}