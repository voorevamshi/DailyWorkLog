/**
 * 
 */
package com.survey.copy;

import java.util.Date;
import java.util.List;


/**
 * @author amahesh9 DTO class w.r.t FormSurvey entity.
 */
public class FormSurveyDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private Integer numOfQuestions;
	private String formSurveyName;
	private String formSurveyVersion;
	private String formSurveyDescription;
	private String surveyCd;
	private String transKey;
	private String lastQuestionCd;
	private String ansSelectedForLastQuesCd;

	private String surveyButtonInd;
	private String effectiveDt;
	
	private List<KeyValueDto> memberDetails;

	private List<FormSurveyComponentDto> formSurveyComponentDtoList;

	public String getFormSurveyName() {
		return formSurveyName;
	}

	public void setFormSurveyName(String formSurveyName) {
		this.formSurveyName = formSurveyName;
	}

	public String getFormSurveyVersion() {
		return formSurveyVersion;
	}

	public void setFormSurveyVersion(String formSurveyVersion) {
		this.formSurveyVersion = formSurveyVersion;
	}

	public String getFormSurveyDescription() {
		return formSurveyDescription;
	}

	public void setFormSurveyDescription(String formSurveyDescription) {
		this.formSurveyDescription = formSurveyDescription;
	}

	public List<FormSurveyComponentDto> getFormSurveyComponentDtoList() {
		return formSurveyComponentDtoList;
	}

	public void setFormSurveyComponentDtoList(List<FormSurveyComponentDto> formSurveyComponentDtoList) {
		this.formSurveyComponentDtoList = formSurveyComponentDtoList;

	}


	public int getNumOfQuestions() {
		return numOfQuestions;
	}

	public void setNumOfQuestions(int numOfQuestions) {
		this.numOfQuestions = numOfQuestions;

	}


	public String getSurveyCd() {
		return surveyCd;
	}

	public void setSurveyCd(String surveyCd) {
		this.surveyCd = surveyCd;

	}

	public String getTransKey() {
		return transKey;
	}

	public void setTransKey(String transKey) {
		this.transKey = transKey;
	}

	public String getLastQuestionCd() {
		return lastQuestionCd;
	}

	public void setLastQuestionCd(String lastQuestionCd) {
		this.lastQuestionCd = lastQuestionCd;

	}


	public String getAnsSelectedForLastQuesCd() {
		return ansSelectedForLastQuesCd;
	}

	public void setAnsSelectedForLastQuesCd(String ansSelectedForLastQuesCd) {
		this.ansSelectedForLastQuesCd = ansSelectedForLastQuesCd;
	}


	public String getEffectiveDt() {
		return effectiveDt;
	}

	public void setEffectiveDt(String effectiveDt) {
		this.effectiveDt = effectiveDt;

	}
	public String getSurveyButtonInd() {
		return surveyButtonInd;
	}

	public void setSurveyButtonInd(String surveyButtonInd) {
		this.surveyButtonInd = surveyButtonInd;
	}
	public List<KeyValueDto> getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(List<KeyValueDto> memberDetails) {
		this.memberDetails = memberDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ansSelectedForLastQuesCd == null) ? 0 : ansSelectedForLastQuesCd.hashCode());
		result = prime * result + ((effectiveDt == null) ? 0 : effectiveDt.hashCode());
		result = prime * result + ((formSurveyComponentDtoList == null) ? 0 : formSurveyComponentDtoList.hashCode());
		result = prime * result + ((formSurveyDescription == null) ? 0 : formSurveyDescription.hashCode());
		result = prime * result + ((formSurveyName == null) ? 0 : formSurveyName.hashCode());
		result = prime * result + ((formSurveyVersion == null) ? 0 : formSurveyVersion.hashCode());
		result = prime * result + ((lastQuestionCd == null) ? 0 : lastQuestionCd.hashCode());
		result = prime * result + numOfQuestions;
		result = prime * result + ((surveyCd == null) ? 0 : surveyCd.hashCode());
		result = prime * result + ((transKey == null) ? 0 : transKey.hashCode());
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
		FormSurveyDto other = (FormSurveyDto) obj;
		if (ansSelectedForLastQuesCd == null) {
			if (other.ansSelectedForLastQuesCd != null) {
				return false;
			}
		} else if (!ansSelectedForLastQuesCd.equals(other.ansSelectedForLastQuesCd)) {
			return false;
		}
		if (effectiveDt == null) {
			if (other.effectiveDt != null) {
				return false;
			}
		} else if (!effectiveDt.equals(other.effectiveDt)) {
			return false;
		}
		if (formSurveyComponentDtoList == null) {
			if (other.formSurveyComponentDtoList != null) {
				return false;
			}
		} else if (!formSurveyComponentDtoList.equals(other.formSurveyComponentDtoList)) {
			return false;
		}
		if (formSurveyDescription == null) {
			if (other.formSurveyDescription != null) {
				return false;
			}
		} else if (!formSurveyDescription.equals(other.formSurveyDescription)) {
			return false;
		}
		if (formSurveyName == null) {
			if (other.formSurveyName != null) {
				return false;
			}
		} else if (!formSurveyName.equals(other.formSurveyName)) {
			return false;
		}
		if (formSurveyVersion == null) {
			if (other.formSurveyVersion != null) {
				return false;
			}
		} else if (!formSurveyVersion.equals(other.formSurveyVersion)) {
			return false;
		}
		if (lastQuestionCd == null) {
			if (other.lastQuestionCd != null) {
				return false;
			}
		} else if (!lastQuestionCd.equals(other.lastQuestionCd)) {
			return false;
		}
		if (numOfQuestions != other.numOfQuestions) {
			return false;
		}
		if (surveyCd == null) {
			if (other.surveyCd != null) {
				return false;
			}
		} else if (!surveyCd.equals(other.surveyCd)) {
			return false;
		}
		if (transKey == null) {
			if (other.transKey != null) {
				return false;
			}
		} else if (!transKey.equals(other.transKey)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FormSurveyDto [numOfQuestions=" + numOfQuestions + ", formSurveyName=" + formSurveyName
				+ ", formSurveyVersion=" + formSurveyVersion + ", formSurveyDescription=" + formSurveyDescription
				+ ", surveyCd=" + surveyCd + ", transKey=" + transKey + ", lastQuestionCd=" + lastQuestionCd
				+ ", ansSelectedForLastQuesCd=" + ansSelectedForLastQuesCd + ",surveyButtonInd=" + surveyButtonInd+",effectiveDt=" + effectiveDt
				+ ", formSurveyComponentDtoList=" + formSurveyComponentDtoList + ", memberDetails=" + memberDetails+ "]";
	}
}