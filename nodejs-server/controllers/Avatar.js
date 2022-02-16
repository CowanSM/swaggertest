'use strict';

var utils = require('../utils/writer.js');
var Avatar = require('../service/AvatarService');

module.exports.avatarUidGET = function avatarUidGET (req, res, next, uid) {
  Avatar.avatarUidGET(uid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidAvatarsGET = function userUuidAvatarsGET (req, res, next, uuid) {
  Avatar.userUuidAvatarsGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
