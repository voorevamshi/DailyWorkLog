package com.survey.copy;

import java.util.List;
import java.util.Map;

public class FormSurveyQuestionAnswerOptionComboDto extends AbstractDto {
	private static final long serialVersionUID = 1L;
	
    private Integer combinationId;

    private Integer assgnFormSurveyQuestion;

    private List<String> answerCombination;

    private Map<String, String> answerCombinationText;

    private String comboOutcomeValue;

    private String comboNextQuestionCd;
    
	private String comboNextQuestionNavigationCd;

	private String comboNextComponentCd;

    public Integer getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(Integer combinationId) {
        this.combinationId = combinationId;
    }

    public Integer getAssgnFormSurveyQuestion() {
        return assgnFormSurveyQuestion;
    }

    public void setAssgnFormSurveyQuestion(Integer assgnFormSurveyQuestion) {
        this.assgnFormSurveyQuestion = assgnFormSurveyQuestion;
    }

    public void setAnswerCombination(List<String> answerCombination) {
        this.answerCombination = answerCombination;
    }

    public Map<String, String> getAnswerCombinationText() {
        return answerCombinationText;
    }

    public void setAnswerCombinationText(Map<String, String> answerCombinationText) {
        this.answerCombinationText = answerCombinationText;
    }

    public List<String> getAnswerCombination() {
        return answerCombination;
    }

    public String getComboOutcomeValue() {
        return comboOutcomeValue;
    }

    public void setComboOutcomeValue(String comboOutcomeValue) {
        this.comboOutcomeValue = comboOutcomeValue;
    }

    public String getComboNextQuestionCd() {
        return comboNextQuestionCd;
    }

    public void setComboNextQuestionCd(String comboNextQuestionCd) {
        this.comboNextQuestionCd = comboNextQuestionCd;
    }

    public String getComboNextQuestionNavigationCd() {
		return comboNextQuestionNavigationCd;
	}

	public void setComboNextQuestionNavigationCd(String comboNextQuestionNavigationCd) {
		this.comboNextQuestionNavigationCd = comboNextQuestionNavigationCd;
	}

	public String getComboNextComponentCd() {
		return comboNextComponentCd;
	}

	public void setComboNextComponentCd(String comboNextComponentCd) {
		this.comboNextComponentCd = comboNextComponentCd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((combinationId == null) ? 0 : combinationId.hashCode());
		result = prime * result + ((answerCombination == null) ? 0 : answerCombination.hashCode());
		result = prime * result + ((answerCombinationText == null) ? 0 : answerCombinationText.hashCode());
		result = prime * result + ((assgnFormSurveyQuestion == null) ? 0 : assgnFormSurveyQuestion.hashCode());
		result = prime * result + ((comboNextComponentCd == null) ? 0 : comboNextComponentCd.hashCode());
		result = prime * result + ((comboNextQuestionCd == null) ? 0 : comboNextQuestionCd.hashCode());
		result = prime * result
				+ ((comboNextQuestionNavigationCd == null) ? 0 : comboNextQuestionNavigationCd.hashCode());
		result = prime * result + ((comboOutcomeValue == null) ? 0 : comboOutcomeValue.hashCode());
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
		FormSurveyQuestionAnswerOptionComboDto other = (FormSurveyQuestionAnswerOptionComboDto) obj;
		if (combinationId == null) {
			if (other.combinationId != null) {
				return false;
			}
		} else if (!combinationId.equals(other.combinationId)) {
			return false;
		}
		if (answerCombination == null) {
			if (other.answerCombination != null) {
				return false;
			}
		} else if (!answerCombination.equals(other.answerCombination)) {
			return false;
		}
		if (answerCombinationText == null) {
			if (other.answerCombinationText != null) {
				return false;
			}
		} else if (!answerCombinationText.equals(other.answerCombinationText)) {
			return false;
		}
		if (assgnFormSurveyQuestion == null) {
			if (other.assgnFormSurveyQuestion != null) {
				return false;
			}
		} else if (!assgnFormSurveyQuestion.equals(other.assgnFormSurveyQuestion)) {
			return false;
		}
		if (comboNextComponentCd == null) {
			if (other.comboNextComponentCd != null) {
				return false;
			}
		} else if (!comboNextComponentCd.equals(other.comboNextComponentCd)) {
			return false;
		}
		if (comboNextQuestionCd == null) {
			if (other.comboNextQuestionCd != null) {
				return false;
			}
		} else if (!comboNextQuestionCd.equals(other.comboNextQuestionCd)) {
			return false;
		}
		if (comboNextQuestionNavigationCd == null) {
			if (other.comboNextQuestionNavigationCd != null) {
				return false;
			}
		} else if (!comboNextQuestionNavigationCd.equals(other.comboNextQuestionNavigationCd)) {
			return false;
		}
		if (comboOutcomeValue == null) {
			if (other.comboOutcomeValue != null) {
				return false;
			}
		} else if (!comboOutcomeValue.equals(other.comboOutcomeValue)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FormSurveyQuestionAnswerOptionComboDto [combinationId=" + combinationId + ", assgnFormSurveyQuestion="
				+ assgnFormSurveyQuestion + ", answerCombination=" + answerCombination + ", answerCombinationText="
				+ answerCombinationText + ", comboOutcomeValue=" + comboOutcomeValue + ", comboNextQuestionCd="
				+ comboNextQuestionCd + ", comboNextQuestionNavigationCd=" + comboNextQuestionNavigationCd
				+ ", comboNextComponentCd=" + comboNextComponentCd + "]";
	}

	

}
