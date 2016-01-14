package com.rongyi.rss.rcc;

import com.rongyi.easy.entity.CodeEntity;

public interface RCCGenerateCodeService {
	// 发码API
	public String generateCode(CodeEntity codeEntity);
}
