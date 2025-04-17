package com.survey.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KeyValueDto extends AbstractDto {
	private static final long serialVersionUID = 1L;

	private String key;
	private String value;
	
	public KeyValueDto() {}

	public KeyValueDto(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public static Map<String,String> convertKeyValueDtoListToMap(List<KeyValueDto> kvList) {
		Map<String,String> kvMap = new HashMap<String,String>();
		
		if (kvList != null) {
			for (KeyValueDto kvDto : kvList) {
				if (kvDto.getKey() != null) {
					kvMap.put(kvDto.getKey(), kvDto.getValue());
				}
			}
		}
		
		return kvMap;
	}

	public static List<KeyValueDto> convertMapToKeyValueDtoList(Map<String,String> kvMap) {
		List<KeyValueDto> kvList = new ArrayList<KeyValueDto>();
		
		if (kvMap != null) {
			for (Map.Entry<String,String> entry : kvMap.entrySet()) {
				kvList.add(new KeyValueDto(entry.getKey(), entry.getValue()));
			}
		}
		
		return kvList;
	}
	
	public static Map<String,String> convertKeyValueDtoSetToMap(Set<KeyValueDto> kvSet) {
		Map<String,String> kvMap = new HashMap<String,String>();
		
		if (kvSet != null) {
			for (KeyValueDto kvDto : kvSet) {
				if (kvDto.getKey() != null) {
					kvMap.put(kvDto.getKey(), kvDto.getValue());
				}
			}
		}
		
		return kvMap;
	}		

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KeyValueDto [key=");
		builder.append(key);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValueDto other = (KeyValueDto) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}