/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.exchange.services.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.office365.odata.interfaces.*;
import com.microsoft.office365.exchange.services.model.*;

public class FileAttachmentFetcher extends ODataEntityFetcher<FileAttachment,FileAttachmentOperations> implements Executable<FileAttachment> {

	 public FileAttachmentFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, FileAttachment.class,FileAttachmentOperations.class);
    }
}