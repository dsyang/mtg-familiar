/*
 * Copyright 2017 Adam Feinstein
 *
 * This file is part of MTG Familiar.
 *
 * MTG Familiar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MTG Familiar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MTG Familiar.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.gelakinetic.GathererScraper.JsonTypes;

import com.gelakinetic.mtgfam.helpers.database.CardDbAdapter;

/*
 * This class contains all information about a scraped card
 *
 * @author AEFeinstein
 *
 */
public class Card {

    // The card's name
    public String mName = "";

    // The card's mana cost
    public String mManaCost = "";

    // The card's converted mana cost
    public int mCmc = 0;

    // The card's type, includes super and sub
    public String mType = "";

    // The card's text text
    public String mText = "";

    // The card's flavor text
    public String mFlavor = "";

    // The card's expansion
    public String mExpansion = "";

    // The card's rarity
    public char mRarity = '\0';

    // The card's collector's number. Not an integer (i.e. 181a, 181b)
    public String mNumber = "";

    // The card's artist
    public String mArtist = "";

    // The card's colors
    public String mColor = "";

    // The card's colors
    public String mColorIdentity = "";

    // The card's multiverse id
    public int mMultiverseId = 0;

    // The card's power. Not an integer (i.e. *+1, X)
    public float mPower = CardDbAdapter.NO_ONE_CARES;

    // The card's toughness, see mPower
    public float mToughness = CardDbAdapter.NO_ONE_CARES;

    // The card's loyalty. An integer in practice
    public int mLoyalty = CardDbAdapter.NO_ONE_CARES;

    // All the card's foreign printings
    public ForeignPrinting[] mForeignPrintings;

    // The card's loyalty. An integer in practice
    public String mWatermark = "";

    // Private class for encapsulating foreign printing information
    public static class ForeignPrinting {
        public int mMultiverseId;
        public String mName;
        public String mLanguageCode;
    }
}