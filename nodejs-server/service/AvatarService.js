'use strict';


/**
 * Retrieve avatar information
 * Retrieve avatar info for given id
 *
 * uid String Avatar Unique Id
 * returns avatar
 **/
exports.avatarUidGET = function(uid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "pieces" : [ {
    "value" : "",
    "element" : "element"
  }, {
    "value" : "",
    "element" : "element"
  } ],
  "uid" : "uid",
  "skin" : "skin",
  "model" : "model"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Retrieve avatars for user
 * Retrieve all avatar info for the given user
 *
 * uuid String Unique User Id
 * returns List
 **/
exports.userUuidAvatarsGET = function(uuid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "pieces" : [ {
    "value" : "",
    "element" : "element"
  }, {
    "value" : "",
    "element" : "element"
  } ],
  "uid" : "uid",
  "skin" : "skin",
  "model" : "model"
}, {
  "pieces" : [ {
    "value" : "",
    "element" : "element"
  }, {
    "value" : "",
    "element" : "element"
  } ],
  "uid" : "uid",
  "skin" : "skin",
  "model" : "model"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

