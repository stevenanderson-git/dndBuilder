2020-08-30
Updated
* characterFiles -> changed to characterbuilder to update naming schemes
* added characterbuilderinfo to keep notes of ideas during build process
* SpellScribe class added. Will be used to create spells. Spells will be added to a list of spells for the current d20 system.
* Restructured files based on control model view
    - updated imports/packages based on new file structure
* added .gitignore


2020-08-27
Added
* Finished Spell.toString()
* Comparable interface added to Spell.java
* Changed Attribute and Skill lists to Array[]
* Added playerClassFiles for future implementation
* Attribute Class has been finilized as of 0.1.Alpha
* Skills Class ahs been finalized as of 0.1.Alpha
* Added version and name at the header of each file (Version: 0.1.Alpha 2020/08/27 Steven Anderson)
Updated
* Readme
* added notes in empty folders for understanding future use



2020-08-26
Added
* CHANGELOG.md created.
* Die.java for creation of an RNG element. Can be used to roll hitdie, attacks, inspiration
* Changed Race -> Heritage as 5e information suggests that change will occur
* Added Boolean inspiration and inspirationToggle(). Inspiration will be scaled/calculated based on playerLevel
* Created CharacterClassList to easily manage classes and have custom sorting
    - CharacterClasslist still in progress
* Moved Default values to separate method as a "Reset" option to have in customization


Notes
* Tested git remote among multiple machines.