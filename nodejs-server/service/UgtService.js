'use strict';


/**
 * Retrieve ugts for given user ids.
 * Retrieve all UGTs for a set of supplied user ids.
 *
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * uuids List Uuid List
 * returns portal
 **/
exports.developersDeveloperKeyAppKeyUgtGET = function(developerKey,appKey,uuids) {
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
 * Fetch UGT for user.
 * Get the UGT set by user for the given developer-app key pair.
 *
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns inline_response_200_1
 **/
exports.developersDeveloperKeyAppKeyUuidUgtGET = function(uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "ugt" : {
    "owner" : "owner",
    "uid" : "uid",
    "name" : "name"
  },
  "apiResponse" : {
    "code" : 0,
    "type" : "type",
    "message" : "message"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Set UGT for user.
 * Set the UGT for given user and the developer-app key pair.
 *
 * body Uuid_ugt_body Contains the (valid) ugt to set for the given user/app pair.
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeyUuidUgtPOST = function(body,uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "code" : 0,
  "type" : "type",
  "message" : "message"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Retrieve ugts for user
 * Retrieve a list of ugts for the described user
 *
 * uuid String Unique User Id
 * returns List
 **/
exports.userUuidUgtGET = function(uuid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "ugt" : [ {
    "owner" : "owner",
    "uid" : "uid",
    "name" : "name"
  }, {
    "owner" : "owner",
    "uid" : "uid",
    "name" : "name"
  } ],
  "portals" : [ {
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
  } ],
  "uuid" : "uuid",
  "avatars" : [ {
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
  } ]
}, {
  "ugt" : [ {
    "owner" : "owner",
    "uid" : "uid",
    "name" : "name"
  }, {
    "owner" : "owner",
    "uid" : "uid",
    "name" : "name"
  } ],
  "portals" : [ {
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
  } ],
  "uuid" : "uuid",
  "avatars" : [ {
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
  } ]
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

