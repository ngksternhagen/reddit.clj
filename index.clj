{:namespaces
 ({:source-url nil,
   :wiki-url "reddit.clj.client-api.html",
   :name "reddit.clj.client",
   :doc "DO NOT use forms under this ns."}
  {:source-url nil,
   :wiki-url "reddit.clj.core-api.html",
   :name "reddit.clj.core",
   :doc "Reddit client for clojure"}),
 :vars
 ({:arglists ([domain-name cookie rcount since]),
   :name "domainreddits",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/reddit.clj.client-api.html#reddit.clj.client/domainreddits",
   :doc "Get reddits from specific domain",
   :var-type "function",
   :line 121,
   :file "reddit/clj/client.clj"}
  {:arglists ([url cookie]),
   :name "info",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/reddit.clj.client-api.html#reddit.clj.client/info",
   :doc "Find information about a url in reddit",
   :var-type "function",
   :line 128,
   :file "reddit/clj/client.clj"}
  {:arglists ([user passwd]),
   :name "login",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/reddit.clj.client-api.html#reddit.clj.client/login",
   :doc "Login to reddit",
   :var-type "function",
   :line 86,
   :file "reddit/clj/client.clj"}
  {:arglists ([cookie]),
   :name "me",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/reddit.clj.client-api.html#reddit.clj.client/me",
   :doc "Load current user information",
   :var-type "function",
   :line 140,
   :file "reddit/clj/client.clj"}
  {:arglists ([cookie]),
   :name "mine",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/reddit.clj.client-api.html#reddit.clj.client/mine",
   :doc "Load user's subscribed subreddits",
   :var-type "function",
   :line 134,
   :file "reddit/clj/client.clj"}
  {:arglists ([reddit-id cookie]),
   :name "redditcomments",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/reddit.clj.client-api.html#reddit.clj.client/redditcomments",
   :doc "Get comments for a reddit",
   :var-type "function",
   :line 114,
   :file "reddit/clj/client.clj"}
  {:arglists ([cookie rcount since]),
   :name "savedreddits",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/reddit.clj.client-api.html#reddit.clj.client/savedreddits",
   :doc "Get current users' saved reddits",
   :var-type "function",
   :line 93,
   :file "reddit/clj/client.clj"}
  {:arglists ([rname cookie rcount since]),
   :name "subreddit",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/reddit.clj.client-api.html#reddit.clj.client/subreddit",
   :doc "Get subreddit items",
   :var-type "function",
   :line 100,
   :file "reddit/clj/client.clj"}
  {:arglists ([user cookie qualifier rcount since]),
   :name "userreddit",
   :namespace "reddit.clj.client",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/reddit.clj.client-api.html#reddit.clj.client/userreddit",
   :doc "Get user reddits",
   :var-type "function",
   :line 107,
   :file "reddit/clj/client.clj"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/about",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this user]),
   :doc "Retrieve user information",
   :name "about"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/add-comment",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id text]),
   :doc "Comment on a post or comment",
   :name "add-comment"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/comments",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this reddit-id]),
   :doc "Retrieve comments for a reddit",
   :name "comments"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/domain",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this domain-name] [this domain-name rcount after]),
   :doc "Retrieve reddits under a domain",
   :name "domain"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/hide",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Hide a post",
   :name "hide"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/info",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this url]),
   :doc "Retrieve url information from reddit",
   :name "info"}
  {:arglists ([] [user passwd]),
   :name "login",
   :namespace "reddit.clj.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/login",
   :doc "Login to reddit, return cookie as user credential",
   :var-type "function",
   :line 105,
   :file "/home/nsun2/projects/reddit.clj/src/reddit/clj/core.clj"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/me",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this]),
   :doc "Retrieve user information according to current credential",
   :name "me"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/mine",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this]),
   :doc
   "Retrieve subcribed subreddits according to current credential ",
   :name "mine"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/reddits",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this rname] [this rname rcount after]),
   :doc "Retrieve reddits from subreddit",
   :name "reddits"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/rescind-vote",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Rescind vote to a comment or post",
   :name "rescind-vote"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/save",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Add a post to your saved reddits",
   :name "save"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/saved",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this] [this rcount after]),
   :doc "Retrieve saved reddits",
   :name "saved"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/submit-link",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this title url sr]),
   :doc "Submit a link to particular subreddit",
   :name "submit-link"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/submit-text",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this title text sr]),
   :doc "Submit a self post to particular subreddit",
   :name "submit-text"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/unhide",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Unhide a post",
   :name "unhide"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/unsave",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Remove a post from your saved reddits",
   :name "unsave"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/user",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists
   ([this user]
    [this user qualifier]
    [this user qualifier rcount after]),
   :doc "Retrieve reddits related by user",
   :name "user"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/vote-down",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Vote down a comment or post",
   :name "vote-down"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/reddit.clj.core-api.html#reddit.clj.core/vote-up",
   :namespace "reddit.clj.core",
   :var-type "function",
   :arglists ([this id]),
   :doc "Vote up a comment or post",
   :name "vote-up"})}
