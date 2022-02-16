'use strict';

var utils = require('../utils/writer.js');
var User = require('../service/UserService');

module.exports.developersDeveloperKeyAppKeySessionsUuidDELETE = function developersDeveloperKeyAppKeySessionsUuidDELETE (req, res, next, uuid, developerKey, sessionKey, appKey) {
  User.developersDeveloperKeyAppKeySessionsUuidDELETE(uuid, developerKey, sessionKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPATCH = function developersDeveloperKeyAppKeySessionsUuidPATCH (req, res, next, body, uuid, developerKey, appKey) {
  User.developersDeveloperKeyAppKeySessionsUuidPATCH(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPOST = function developersDeveloperKeyAppKeySessionsUuidPOST (req, res, next, uuid, developerKey, appKey) {
  User.developersDeveloperKeyAppKeySessionsUuidPOST(uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPUT = function developersDeveloperKeyAppKeySessionsUuidPUT (req, res, next, body, uuid, developerKey, appKey) {
  User.developersDeveloperKeyAppKeySessionsUuidPUT(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidAvatarsGET = function userUuidAvatarsGET (req, res, next, uuid) {
  User.userUuidAvatarsGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidGET = function userUuidGET (req, res, next, uuid) {
  User.userUuidGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidPortalsGET = function userUuidPortalsGET (req, res, next, uuid) {
  User.userUuidPortalsGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidUgtGET = function userUuidUgtGET (req, res, next, uuid) {
  User.userUuidUgtGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
