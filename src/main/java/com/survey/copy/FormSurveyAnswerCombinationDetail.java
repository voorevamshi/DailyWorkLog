package com.survey.copy;

import java.util.List;

public class FormSurveyAnswerCombinationDetail extends AbstractDto{

    private String defaultOutcomeValue;

    private List<FormSurveyQuestionAnswerOptionComboDto> formSurveyQuestionAnswerOptionComboDtoList;

	public String getDefaultOutcomeValue() {
		return defaultOutcomeValue;
	}

	public void setDefaultOutcomeValue(String defaultOutcomeValue) {
		this.defaultOutcomeValue = defaultOutcomeValue;
	}

	public List<FormSurveyQuestionAnswerOptionComboDto> getFormSurveyQuestionAnswerOptionComboDtoList() {
		return formSurveyQuestionAnswerOptionComboDtoList;
	}

	public void setFormSurveyQuestionAnswerOptionComboDtoList(
			List<FormSurveyQuestionAnswerOptionComboDto> formSurveyQuestionAnswerOptionComboDtoList) {
		this.formSurveyQuestionAnswerOptionComboDtoList = formSurveyQuestionAnswerOptionComboDtoList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defaultOutcomeValue == null) ? 0 : defaultOutcomeValue.hashCode());
		result = prime * result + ((formSurveyQuestionAnswerOptionComboDtoList == null) ? 0
				: formSurveyQuestionAnswerOptionComboDtoList.hashCode());
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
		FormSurveyAnswerCombinationDetail other = (FormSurveyAnswerCombinationDetail) obj;
		if (defaultOutcomeValue == null) {
			if (other.defaultOutcomeValue != null) {
				return false;
			}
		} else if (!defaultOutcomeValue.equals(other.defaultOutcomeValue)) {
			return false;
		}
		
		if (formSurveyQuestionAnswerOptionComboDtoList == null) {
		    return other.formSurveyQuestionAnswerOptionComboDtoList == null;
		} else {
		    return formSurveyQuestionAnswerOptionComboDtoList.equals(other.formSurveyQuestionAnswerOptionComboDtoList);
		}
	}

	@Override
	public String toString() {
		return "FormSurveyAnswerCombinationDetail [defaultOutcomeValue=" + defaultOutcomeValue
				+ ", formSurveyQuestionAnswerOptionComboDtoList=" + formSurveyQuestionAnswerOptionComboDtoList + "]";
	}

}
