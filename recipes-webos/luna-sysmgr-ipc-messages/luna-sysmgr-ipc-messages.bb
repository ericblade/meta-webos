# (c) Copyright 2012  Hewlett-Packard Development Company, L.P. 

DESCRIPTION = "IPC messages for multiprocess support in LunaSysMgr"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
SECTION = "None"
PROVIDES = "luna-sysmgr-ipc-messages"
DEPENDS = "luna-sysmgr-ipc luna-webkit-api"

PR = "r0"

inherit webos_component
inherit webos_public_repo
inherit webos_submissions
inherit webos_cmake

WEBOS_GIT_TAG = "${WEBOS_SUBMISSION}"
SRC_URI = "${OPENWEBOS_GIT_REPO}/${PN};tag=${WEBOS_GIT_TAG};protocol=git"
S="${WORKDIR}/git"

ALLOW_EMPTY = "1"


