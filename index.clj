{:namespaces
 ({:source-url nil,
   :wiki-url "clj-hector.core-api.html",
   :name "clj-hector.core",
   :doc nil}
  {:source-url nil,
   :wiki-url "clj-hector.ddl-api.html",
   :name "clj-hector.ddl",
   :author "Antonio Garrote, Paul Ingles",
   :doc nil}
  {:source-url nil,
   :wiki-url "clj-hector.serialize-api.html",
   :name "clj-hector.serialize",
   :author "Paul Ingles",
   :doc nil}
  {:source-url nil,
   :wiki-url "clj-hector.time-api.html",
   :name "clj-hector.time",
   :author "Paul Ingles",
   :doc nil}),
 :vars
 ({:arglists ([cluster-name host] [cluster-name host port]),
   :name "cluster",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/cluster",
   :doc "Connects to Cassandra cluster",
   :var-type "function",
   :line 19,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks pk cf & options__36__auto__]),
   :name "count-columns",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/count-columns",
   :doc
   "Counts number of columns for pk in column family cf. The method is not O(1).\nIt takes all the columns from disk to calculate the answer. The only benefit\nof the method is that you do not need to pull all the columns over Thrift\ninterface to count them.",
   :var-type "function",
   :line 159,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([name value & options__36__auto__]),
   :name "create-column",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/create-column",
   :doc
   "Creates Column and SuperColumns.\n\nSerializers for the super column name, column name, and column value default to an instance of TypeInferringSerializer.\n\nExamples: (create-column \"name\" \"a value\")  (create-column \"super column name\" {\"name\" \"value\"})",
   :var-type "function",
   :line 32,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([cf-name ks]),
   :name "defschema",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/defschema",
   :doc
   "Defines a schema for the named column family. The provided\nserializers will be used when operations are performed with\nthe with-schemas macro.",
   :var-type "macro",
   :line 173,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pk cs]),
   :name "delete-columns",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.core-api.html#clj-hector.core/delete-columns",
   :doc "Deletes columns identified in cs for row pk.",
   :var-type "function",
   :line 129,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pks]),
   :name "delete-rows",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/delete-rows",
   :doc "Deletes all columns for rows identified in pks sequence.",
   :var-type "function",
   :line 152,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf coll & o]),
   :name "delete-super-columns",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.core-api.html#clj-hector.core/delete-super-columns",
   :doc
   "Coll is a map of keys, super column names and column names\n\nExample: (delete-super-columns keyspace \"ColumnFamily\" {\"row-key\" {\"SuperCol\" [\"col-name\"]}})",
   :var-type "function",
   :line 136,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pk c & o]),
   :name "get-columns",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/get-columns",
   :doc
   "In keyspace ks, retrieve c columns for row pk from column family cf",
   :var-type "function",
   :line 113,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pks & o]),
   :name "get-rows",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/get-rows",
   :doc
   "In keyspace ks, retrieve rows for pks within column family cf.",
   :var-type "function",
   :line 87,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pk sc c & o]),
   :name "get-super-columns",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.core-api.html#clj-hector.core/get-super-columns",
   :doc
   "In keyspace ks, for row pk, retrieve columns in c from super column sc.",
   :var-type "function",
   :line 99,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pks scs & o]),
   :name "get-super-rows",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.core-api.html#clj-hector.core/get-super-rows",
   :doc
   "In keyspace ks, from Super Column Family cf, retrieve the rows identified by pks. Executed\nas a slice query. The range of columns to select can be provided through the optional named\narguments :start and :end.\n\nOptional: scs can be a sequence of super column names to retrieve columns for.",
   :var-type "function",
   :line 69,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([cluster name]),
   :name "keyspace",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/keyspace",
   :doc
   "Connects the client to the specified Keyspace. All other interactions\nwith Cassandra are performed against this keyspace.",
   :var-type "function",
   :line 26,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([ks cf pk m]),
   :name "put",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/put",
   :doc "Stores values in columns in map m against row key pk",
   :var-type "function",
   :line 44,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([schemas & body]),
   :name "with-schemas",
   :namespace "clj-hector.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.core-api.html#clj-hector.core/with-schemas",
   :doc "Binds ",
   :var-type "macro",
   :line 189,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/core.clj"}
  {:arglists ([cluster keyspace {:keys [name comparator type]}]),
   :name "add-column-family",
   :namespace "clj-hector.ddl",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.ddl-api.html#clj-hector.ddl/add-column-family",
   :doc "Adds a column family to a keyspace",
   :var-type "function",
   :line 43,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/ddl.clj"}
  {:arglists
   ([cluster {:keys [name strategy replication column-families]}]),
   :name "add-keyspace",
   :namespace "clj-hector.ddl",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.ddl-api.html#clj-hector.ddl/add-keyspace",
   :doc "Creates a new keyspace from the definition passed as a map",
   :var-type "function",
   :line 59,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/ddl.clj"}
  {:arglists ([cluster keyspace]),
   :name "column-families",
   :namespace "clj-hector.ddl",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.ddl-api.html#clj-hector.ddl/column-families",
   :doc "Returns all the column families for a certain keyspace",
   :var-type "function",
   :line 102,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/ddl.clj"}
  {:arglists ([cluster keyspace-name column-family-name]),
   :name "drop-column-family",
   :namespace "clj-hector.ddl",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.ddl-api.html#clj-hector.ddl/drop-column-family",
   :doc "Removes a column family from a keyspace",
   :var-type "function",
   :line 54,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/ddl.clj"}
  {:arglists ([cluster keyspace-name]),
   :name "drop-keyspace",
   :namespace "clj-hector.ddl",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.ddl-api.html#clj-hector.ddl/drop-keyspace",
   :doc "Deletes a whole keyspace from the cluster",
   :var-type "function",
   :line 72,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/ddl.clj"}
  {:arglists ([cluster]),
   :name "keyspaces",
   :namespace "clj-hector.ddl",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.ddl-api.html#clj-hector.ddl/keyspaces",
   :doc
   "Description of the keyspaces available in the Cassandra cluster",
   :var-type "function",
   :line 77,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/ddl.clj"}
  {:arglists ([x]),
   :name "serializer",
   :namespace "clj-hector.serialize",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-hector.serialize-api.html#clj-hector.serialize/serializer",
   :doc
   "Returns an instance of the specified serializer.\n\nArgument: either a) instance of Serializer.\n                 b) a keyword for one of the supported serializers.\n                 c) any object.\n\nIf an object is passed the relevant serializer will be determined by\nHector's SerializerTypeInferer. This can be useful when serializing\nstrings or other types where serializers can be determined automatically.\n\nSupported serializers: :integer, :string, :long, :bytes, :uuid\n:bigint, :bool, :date, :object, :ascii, :byte-buffer, :char, :double\n:float, :short.",
   :var-type "function",
   :line 77,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/serialize.clj"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url
   "/clj-hector.serialize-api.html#clj-hector.serialize/to-clojure",
   :namespace "clj-hector.serialize",
   :var-type "function",
   :arglists ([_]),
   :doc "Convert hector types to Clojure data structures.",
   :name "to-clojure"}
  {:raw-source-url nil,
   :source-url nil,
   :wiki-url "/clj-hector.time-api.html#clj-hector.time/epoch",
   :namespace "clj-hector.time",
   :var-type "function",
   :arglists ([_]),
   :doc
   "Returns the milliseconds since epoch. Epoch can be either\na java.util.Date instance, or an org.joda.time.ReadableInstant",
   :name "epoch"}
  {:arglists ([bytes]),
   :name "from-bytes",
   :namespace "clj-hector.time",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.time-api.html#clj-hector.time/from-bytes",
   :doc "Deserializes a TimeUUID object from a byte array.",
   :var-type "function",
   :line 31,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/time.clj"}
  {:arglists ([object]),
   :name "get-date",
   :namespace "clj-hector.time",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.time-api.html#clj-hector.time/get-date",
   :doc
   "Retrieves the date from a TimeUUID object. TimeUUID can be provided as either\na UUID instance, or serialized as a byte array.",
   :var-type "multimethod",
   :line 40,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/time.clj"}
  {:arglists ([uuid]),
   :name "to-bytes",
   :namespace "clj-hector.time",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.time-api.html#clj-hector.time/to-bytes",
   :doc
   "Converts a TimeUUID object to a byte array suitable for serializing.",
   :var-type "function",
   :line 26,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/time.clj"}
  {:arglists ([time]),
   :name "uuid",
   :namespace "clj-hector.time",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-hector.time-api.html#clj-hector.time/uuid",
   :doc "Creates a UUID from an epoch value",
   :var-type "function",
   :line 21,
   :file "/Users/paul/Work/clj-hector/src/clj_hector/time.clj"})}
