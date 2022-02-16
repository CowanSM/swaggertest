'use strict';


/**
 * End a Session
 * End an active session for an user.
 *
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * sessionKey String Session Key from POST
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeySessionsUuidDELETE = function(uuid,developerKey,sessionKey,appKey) {
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
 * Pause Or Resume Session
 * Pause or Resume a session without ending the session
 *
 * body Sessions_uuid_body Has relevant session info for update.
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeySessionsUuidPATCH = function(body,uuid,developerKey,appKey) {
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
 * Start a Session
 * Start a Session for the user
 *
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns inline_response_200
 **/
exports.developersDeveloperKeyAppKeySessionsUuidPOST = function(uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "response" : {
    "code" : 0,
    "type" : "type",
    "message" : "message"
  },
  "session" : {
    "sessionKey" : "sessionKey",
    "ttl" : 0
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
 * Keep-Alive a Session
 * Keep an active session for an user alive
 *
 * body SessionInfo Has relevant session info for update.
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeySessionsUuidPUT = function(body,uuid,developerKey,appKey) {
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
  "uid" : "uid",
  "elements" : [ {
    "name" : "name",
    "type" : "",
    "value" : ""
  }, {
    "name" : "name",
    "type" : "",
    "value" : ""
  } ],
  "skin" : "skin",
  "model" : "model"
}, {
  "uid" : "uid",
  "elements" : [ {
    "name" : "name",
    "type" : "",
    "value" : ""
  }, {
    "name" : "name",
    "type" : "",
    "value" : ""
  } ],
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


/**
 * Retrieve user info
 * Retrieve explicit information for user
 *
 * uuid String Unique User Id
 * returns user
 **/
exports.userUuidGET = function(uuid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
    "uid" : "uid",
    "elements" : [ null, null ],
    "skin" : "skin",
    "model" : "model"
  }, {
    "uid" : "uid",
    "elements" : [ null, null ],
    "skin" : "skin",
    "model" : "model"
  } ],
  "uuid" : "uuid",
  "avatars" : [ {
    "uid" : "uid",
    "elements" : [ {
      "name" : "name",
      "type" : "",
      "value" : ""
    }, {
      "name" : "name",
      "type" : "",
      "value" : ""
    } ],
    "skin" : "skin",
    "model" : "model"
  }, {
    "uid" : "uid",
    "elements" : [ {
      "name" : "name",
      "type" : "",
      "value" : ""
    }, {
      "name" : "name",
      "type" : "",
      "value" : ""
    } ],
    "skin" : "skin",
    "model" : "model"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Retrieve portals for user
 * Retrieve all portal info for the given user
 *
 * uuid String Unique User Id
 * returns List
 **/
exports.userUuidPortalsGET = function(uuid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "uid" : "uid",
  "elements" : [ null, null ],
  "skin" : "skin",
  "model" : "model"
}, {
  "uid" : "uid",
  "elements" : [ null, null ],
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
    "uid" : "uid",
    "elements" : [ null, null ],
    "skin" : "skin",
    "model" : "model"
  }, {
    "uid" : "uid",
    "elements" : [ null, null ],
    "skin" : "skin",
    "model" : "model"
  } ],
  "uuid" : "uuid",
  "avatars" : [ {
    "uid" : "uid",
    "elements" : [ {
      "name" : "name",
      "type" : "",
      "value" : ""
    }, {
      "name" : "name",
      "type" : "",
      "value" : ""
    } ],
    "skin" : "skin",
    "model" : "model"
  }, {
    "uid" : "uid",
    "elements" : [ {
      "name" : "name",
      "type" : "",
      "value" : ""
    }, {
      "name" : "name",
      "type" : "",
      "value" : ""
    } ],
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
    "uid" : "uid",
    "elements" : [ null, null ],
    "skin" : "skin",
    "model" : "model"
  }, {
    "uid" : "uid",
    "elements" : [ null, null ],
    "skin" : "skin",
    "model" : "model"
  } ],
  "uuid" : "uuid",
  "avatars" : [ {
    "uid" : "uid",
    "elements" : [ {
      "name" : "name",
      "type" : "",
      "value" : ""
    }, {
      "name" : "name",
      "type" : "",
      "value" : ""
    } ],
    "skin" : "skin",
    "model" : "model"
  }, {
    "uid" : "uid",
    "elements" : [ {
      "name" : "name",
      "type" : "",
      "value" : ""
    }, {
      "name" : "name",
      "type" : "",
      "value" : ""
    } ],
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

