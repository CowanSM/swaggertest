'use strict';

var utils = require('../utils/writer.js');
var Developer = require('../service/DeveloperService');

module.exports.developersDeveloperKeyAppKeySessionsUuidDELETE = function developersDeveloperKeyAppKeySessionsUuidDELETE (req, res, next, uuid, developerKey, sessionKey, appKey) {
  Developer.developersDeveloperKeyAppKeySessionsUuidDELETE(uuid, developerKey, sessionKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPATCH = function developersDeveloperKeyAppKeySessionsUuidPATCH (req, res, next, body, uuid, developerKey, appKey) {
  Developer.developersDeveloperKeyAppKeySessionsUuidPATCH(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPOST = function developersDeveloperKeyAppKeySessionsUuidPOST (req, res, next, uuid, developerKey, appKey) {
  Developer.developersDeveloperKeyAppKeySessionsUuidPOST(uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPUT = function developersDeveloperKeyAppKeySessionsUuidPUT (req, res, next, body, uuid, developerKey, appKey) {
  Developer.developersDeveloperKeyAppKeySessionsUuidPUT(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeyUgtGET = function developersDeveloperKeyAppKeyUgtGET (req, res, next, developerKey, appKey, uuids) {
  Developer.developersDeveloperKeyAppKeyUgtGET(developerKey, appKey, uuids)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeyUuidUgtGET = function developersDeveloperKeyAppKeyUuidUgtGET (req, res, next, uuid, developerKey, appKey) {
  Developer.developersDeveloperKeyAppKeyUuidUgtGET(uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeyUuidUgtPOST = function developersDeveloperKeyAppKeyUuidUgtPOST (req, res, next, body, uuid, developerKey, appKey) {
  Developer.developersDeveloperKeyAppKeyUuidUgtPOST(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
