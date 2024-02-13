package com.company.jmixpm.screen.tipinfo;

import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.TipInfo;

@UiController("TipInfo.browse")
@UiDescriptor("tip-info-browse.xml")
@LookupComponent("tipInfoesTable")
public class TipInfoBrowse extends StandardLookup<TipInfo> {
}