
/**
 * 
 */
package com.survey.copy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amahesh9 DTO class w.r.t FormSurveyComponent entity.
 */

public class FormSurveyComponentDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private String componentCd;
	private String componentDesc;
	private Integer componentSequence;
	private String backgroundImageName;
	private String backgroundImageNameMobile;
	private String componentColor;
	private String componentColorMobile;
	private String componentSummaryContent;
	private String progressBarLabel;
	private String parentComponentCd;

	private List<FormSurveyQuestionDto> formSurveyQuestionDtoList;
	private List<FormSurveyComponentDto> childComponent = new ArrayList<FormSurveyComponentDto>();

	public List<FormSurveyComponentDto> getChildComponent() {
		return childComponent;
	}

	public void setChildComponent(List<FormSurveyComponentDto> childComponent) {
		this.childComponent = childComponent;
	}

	public String getparentComponentCd() {
		return parentComponentCd;
	}

	public void setparentComponentCd(String parentComponentCd) {
		this.parentComponentCd = parentComponentCd;
	}

	public String getComponentCd() {
		return componentCd;
	}

	public void setComponentCd(String componentCd) {
		this.componentCd = componentCd;
	}

	public String getComponentDesc() {
		return componentDesc;
	}

	public void setComponentDesc(String componentDesc) {
		this.componentDesc = componentDesc;
	}

	public Integer getComponentSequence() {
		return componentSequence;
	}

	public void setComponentSequence(Integer componentSequence) {
		this.componentSequence = componentSequence;
	}

	public String getBackgroundImageName() {
		return backgroundImageName;
	}

	public void setBackgroundImageName(String backgroundImageName) {
		this.backgroundImageName = backgroundImageName;
	}

	public String getBackgroundImageNameMobile() {
		return backgroundImageNameMobile;
	}

	public void setBackgroundImageNameMobile(String backgroundImageNameMobile) {
		this.backgroundImageNameMobile = backgroundImageNameMobile;
	}

	public String getComponentColor() {
		return componentColor;
	}

	public void setComponentColor(String componentColor) {
		this.componentColor = componentColor;
	}

	public String getComponentColorMobile() {
		return componentColorMobile;
	}

	public void setComponentColorMobile(String componentColorMobile) {
		this.componentColorMobile = componentColorMobile;
	}

	public List<FormSurveyQuestionDto> getFormSurveyQuestionDtoList() {
		return formSurveyQuestionDtoList;
	}

	public void setFormSurveyQuestionDtoList(List<FormSurveyQuestionDto> formSurveyQuestionDtoList) {
		this.formSurveyQuestionDtoList = formSurveyQuestionDtoList;
	}

	public String getComponentSummaryContent() {
		return componentSummaryContent;
	}

	public void setComponentSummaryContent(String componentSummaryContent) {
		this.componentSummaryContent = componentSummaryContent;
	}

	public String getProgressBarLabel() {
		return progressBarLabel;
	}

	public void setProgressBarLabel(String progressBarLabel) {
		this.progressBarLabel = progressBarLabel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backgroundImageName == null) ? 0 : backgroundImageName.hashCode());
		result = prime * result + ((backgroundImageNameMobile == null) ? 0 : backgroundImageNameMobile.hashCode());
		result = prime * result + ((componentCd == null) ? 0 : componentCd.hashCode());
		result = prime * result + ((componentColor == null) ? 0 : componentColor.hashCode());
		result = prime * result + ((componentColorMobile == null) ? 0 : componentColorMobile.hashCode());
		result = prime * result + ((componentDesc == null) ? 0 : componentDesc.hashCode());
		result = prime * result + ((componentSequence == null) ? 0 : componentSequence.hashCode());
		result = prime * result + ((componentSummaryContent == null) ? 0 : componentSummaryContent.hashCode());
		result = prime * result + ((formSurveyQuestionDtoList == null) ? 0 : formSurveyQuestionDtoList.hashCode());
		result = prime * result + ((progressBarLabel == null) ? 0 : progressBarLabel.hashCode());
		result = prime * result + ((childComponent == null) ? 0 : childComponent.hashCode());
		result = prime * result + ((parentComponentCd == null) ? 0 : parentComponentCd.hashCode());
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

		FormSurveyComponentDto other = (FormSurveyComponentDto) obj;

		if (backgroundImageName == null) {
			if (other.backgroundImageName != null) {
				return false;
			}
		} else if (!backgroundImageName.equals(other.backgroundImageName)) {
			return false;
		}
		if (backgroundImageNameMobile == null) {
			if (other.backgroundImageNameMobile != null) {
				return false;
			}
		} else if (!backgroundImageNameMobile.equals(other.backgroundImageNameMobile)) {
			return false;
		}
		if (componentCd == null) {
			if (other.componentCd != null) {
				return false;
			}
		} else if (!componentCd.equals(other.componentCd)) {
			return false;
		}
		if (parentComponentCd == null) {
			if (other.parentComponentCd != null) {
				return false;
			}
		} else if (!parentComponentCd.equals(other.parentComponentCd)) {
			return false;
		}
		if (componentColor == null) {
			if (other.componentColor != null) {
				return false;
			}
		} else if (!componentColor.equals(other.componentColor)) {
			return false;
		}
		if (componentColorMobile == null) {
			if (other.componentColorMobile != null) {
				return false;
			}
		} else if (!componentColorMobile.equals(other.componentColorMobile)) {
			return false;
		}
		if (componentDesc == null) {
			if (other.componentDesc != null) {
				return false;
			}
		} else if (!componentDesc.equals(other.componentDesc)) {
			return false;
		}
		if (componentSequence == null) {
			if (other.componentSequence != null) {
				return false;
			}
		} else if (!componentSequence.equals(other.componentSequence)) {
			return false;
		}
		if (componentSummaryContent == null) {
			if (other.componentSummaryContent != null) {
				return false;
			}
		} else if (!componentSummaryContent.equals(other.componentSummaryContent)) {
			return false;
		}
		if (formSurveyQuestionDtoList == null) {
			if (other.formSurveyQuestionDtoList != null) {
				return false;
			}
		} else if (!formSurveyQuestionDtoList.equals(other.formSurveyQuestionDtoList)) {
			return false;
		}
		if (progressBarLabel == null) {
			if (other.progressBarLabel != null) {
				return false;
			}
		} else if (!progressBarLabel.equals(other.progressBarLabel)) {
			return false;
		}
		if (childComponent == null) {
			if (other.childComponent != null) {
				return false;
			}
		} else if (!childComponent.equals(other.childComponent)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FormSurveyComponentDto [componentCd=" + componentCd + ", componentDesc=" + componentDesc
				+ ", componentSequence=" + componentSequence + ", backgroundImageName=" + backgroundImageName
				+ ", backgroundImageNameMobile=" + backgroundImageNameMobile + ", componentColor=" + componentColor
				+ ", componentColorMobile=" + componentColorMobile + ", componentSummaryContent="
				+ componentSummaryContent + ", progressBarLabel=" + progressBarLabel + ", formSurveyQuestionDtoList="
				+ formSurveyQuestionDtoList + ", childComponent=" + childComponent + ",  parentComponentCd="
				+ parentComponentCd + "]";
	}
}