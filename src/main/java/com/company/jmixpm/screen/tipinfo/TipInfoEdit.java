package com.company.jmixpm.screen.tipinfo;

import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.TipInfo;

@UiController("TipInfo.edit")
@UiDescriptor("tip-info-edit.xml")
@EditedEntityContainer("tipInfoDc")
public class TipInfoEdit extends StandardEditor<TipInfo> {
}